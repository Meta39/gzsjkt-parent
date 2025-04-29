package io.github.meta39.gzsjktapi.dto.pdhz;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

/**
 * 用户排队列表查询接口
 */
@Data
@JacksonXmlRootElement(localName = "req")
public final class GetUserLineUpListReq {
    /**
     * 医院ID
     */
    @JacksonXmlProperty(localName = "HOS_ID")
    private String hosId;

    /**
     * 用户院内ID
     */
    @JacksonXmlProperty(localName = "HOSP_PATIENT_ID")
    private String hospPatientId;

    /**
     * 用户证件类型：
     * 01-身份证
     */
    @JacksonXmlProperty(localName = "PATIENT_IDCARD_TYPE")
    private String patientIdcardType;

    /**
     * 用户证件号码
     */
    @JacksonXmlProperty(localName = "PATIENT_IDCARD_NO")
    private String patientIdcardNo;

    /**
     * 患者卡类型：
     * 1- 健康卡
     * 2- 市民卡
     * 3- 社保卡
     * 4- 银行卡
     * 5- 公费医疗卡
     * 6- 农合证
     * 7- 院内诊疗卡
     * 8- 就诊卡
     * 9- 系统内部号
     * 99- 其他卡
     */
    @JacksonXmlProperty(localName = "PATIENT_CARD_TYPE")
    private Integer patientCardType;

    /**
     * 患者卡号
     */
    @JacksonXmlProperty(localName = "PATIENT_CARD_NO")
    private String patientCardNo;

    /**
     * 用户姓名
     */
    @JacksonXmlProperty(localName = "PATIENT_NAME")
    private String patientName;

    /**
     * 性别：
     * F-女
     * M-男
     */
    @JacksonXmlProperty(localName = "PATIENT_SEX")
    private String patientSex;

    /**
     * 用户年龄
     */
    @JacksonXmlProperty(localName = "PATIENT_AGE")
    private Integer patientAge;

}
