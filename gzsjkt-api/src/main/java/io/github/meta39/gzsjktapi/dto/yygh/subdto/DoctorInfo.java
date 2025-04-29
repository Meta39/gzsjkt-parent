package io.github.meta39.gzsjktapi.dto.yygh.subdto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public final class DoctorInfo {
    /**
     * 医生代码
     */
    private String doctorId;

    /**
     * 医生名称
     */
    private String doctorName;

    /**
     * 科室ID
     */
    private String deptId;

    /**
     * 医生职称
     */
    @JacksonXmlProperty(localName = "Title")
    private String title;

    /**
     * 医生挂号费
     */
    @JacksonXmlProperty(localName = "Fee")
    private Long fee;

    /**
     * 医生性别
     * M-男性
     * F-女性
     */
    @JacksonXmlProperty(localName = "Gender")
    private String gender;

    /**
     * 医生简介
     */
    @JacksonXmlProperty(localName = "Desc")
    private String desc;
}
