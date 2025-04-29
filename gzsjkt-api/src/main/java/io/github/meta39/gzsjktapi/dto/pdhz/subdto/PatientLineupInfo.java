package io.github.meta39.gzsjktapi.dto.pdhz.subdto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

import java.util.List;

@Data
public final class PatientLineupInfo {

    /**
     * 用户院内ID
     */
    @JacksonXmlProperty(localName = "HOSP_PATIENT_ID")
    private String hospPatientId;

    /**
     * 用户证件类型
     */
    @JacksonXmlProperty(localName = "PATIENT_IDCARD_TYPE")
    private String patientIdcardType;

    /**
     * 用户证件号码
     */
    @JacksonXmlProperty(localName = "PATIENT_IDCARD_NO")
    private String patientIdcardNo;

    /**
     * 用户卡类型，详见参数编码说明
     */
    @JacksonXmlProperty(localName = "PATIENT_CARD_TYPE")
    private String patientCardType;

    /**
     * 用户卡号
     */
    @JacksonXmlProperty(localName = "PATIENT_CARD_NO")
    private String patientCardNo;

    /**
     * 用户姓名
     */
    @JacksonXmlProperty(localName = "PATIENT_NAME")
    private String patientName;

    /**
     * 用户性别
     */
    @JacksonXmlProperty(localName = "PATIENT_SEX")
    private String patientSex;

    /**
     * 用户年龄
     */
    @JacksonXmlProperty(localName = "PATIENT_AGE")
    private Integer patientAge;

    /**
     * 用户排队列表
     */
    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "LINEUP_LIST")
    private List<LineupList> lineupList;

}
