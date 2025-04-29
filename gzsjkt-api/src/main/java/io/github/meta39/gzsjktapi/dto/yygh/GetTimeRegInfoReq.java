package io.github.meta39.gzsjktapi.dto.yygh;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

import java.time.LocalDate;

/**
 * 医生号源分时信息查询
 */
@Data
@JacksonXmlRootElement(localName = "req")
public final class GetTimeRegInfoReq {
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
     * 出诊日期
     * 格式：yyyy-MM-dd
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private LocalDate regDate;

    /**
     * 时段
     * 1:上午
     * 4:中午
     * 2:下午
     * 3:晚上
     */
    private Integer timeFlag;

    /**
     * 1-普通号源（预约系统所有渠道通用）
     * 2：家庭医生号源（如需把号源提供至分级诊疗平台，该字段必传）
     */
    @JacksonXmlProperty(localName = "SourceNumberType")
    private Integer sourceNumberType;
}
