package io.github.meta39.gzsjktapi.dto.zy;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

import java.time.LocalDate;

/**
 * 床位号源信息查询接口
 */
@Data
@JacksonXmlRootElement(localName = "req")
public final class GetBedRegInfoReq {
    /**
     * 医院代码
     */
    private String hospitalId;

    /**
     * 科室代码
     */
    private String deptId;

    /**
     * 床位号源开始日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private LocalDate startDate;

    /**
     * 床位号源结束日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private LocalDate endDate;

}
