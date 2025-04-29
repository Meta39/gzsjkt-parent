package io.github.meta39.gzsjktapi.dto.yygh;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

import java.time.LocalDate;

/**
 * 科室号源信息查询
 */
@Data
@JacksonXmlRootElement(localName = "req")
public final class GetDeptRegInfoReq {
    /**
     * 医院ID
     */
    private String hospitalId;

    /**
     * 科室代码
     */
    private String deptId;

    /**
     * 号源开始日期
     * 格式：yyyy-MM-dd
     * 如果为空则为当前日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private LocalDate startDate;

    /**
     * 号源结束日期
     * 格式：yyyy-MM-dd
     * 如果为空则为当前日期 + 7
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private LocalDate endDate;
}
