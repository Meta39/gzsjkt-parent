package io.github.meta39.gzsjktapi.dto.yygh;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

import java.time.LocalDate;

/**
 * 医生号源信息查询
 */
@Data
@JacksonXmlRootElement(localName = "req")
public final class GetRegInfoReq {
    /**
     * 医院ID
     */
    private String hospitalId;

    /**
     * 科室代码
     */
    private String deptId;

    /**
     * 医生代码
     */
    private String doctorId;

    /**
     * 号源开始日期
     * 格式：yyyy-MM-dd
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private LocalDate startDate;

    /**
     * 号源结束日期
     * 格式：yyyy-MM-dd
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private LocalDate endDate;

    /**
     * 根据号源类型精准查询
     * 1：普通号源
     * 2：家庭医生号源
     */
    @JacksonXmlProperty(localName = "SourceNumberType")
    private Integer sourceNumberType;
}
