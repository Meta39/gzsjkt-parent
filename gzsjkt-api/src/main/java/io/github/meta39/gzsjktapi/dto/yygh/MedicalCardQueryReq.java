package io.github.meta39.gzsjktapi.dto.yygh;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

/**
 * 用户就诊卡查询接口
 */
@Data
@JacksonXmlRootElement(localName = "req")
public final class MedicalCardQueryReq {
    /**
     * 医院代码
     */
    private String hospitalId;

    /**
     * 用户身份证
     */
    @JacksonXmlProperty(localName = "Idcard")
    private String idcard;

    /**
     * 用户就诊卡
     */
    private String medicalCard;

    /**
     * 用户姓名
     */
    private String userName;

}
