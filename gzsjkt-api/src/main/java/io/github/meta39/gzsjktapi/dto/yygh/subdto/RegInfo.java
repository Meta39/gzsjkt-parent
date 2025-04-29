package io.github.meta39.gzsjktapi.dto.yygh.subdto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

import java.util.List;

@Data
public final class RegInfo {
    /**
     * 医生ID
     */
    private String doctorId;

    /**
     * 医生名称
     */
    private String doctorName;

    /**
     * 医生职称
     */
    private String doctorTitle;

    /**
     * 出诊日期集合
     */
    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "TimeRegInfoList")
    private List<TimeRegInfoList> timeRegInfoList;
}
