package io.github.meta39.gzsjktapi.dto.pdhz;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

import java.time.LocalDate;

/**
 * 用户绑定接口
 */
@Data
@JacksonXmlRootElement(localName = "req")
public final class BindUserReq {
    /**
     * 证件类型：
     * 01- 身份证
     * 02- 港澳居民来往内地通行证
     * 03- 台湾居民来往大陆通行证
     */
    @JacksonXmlProperty(localName = "IDCARD_TYPE")
    private String idcardType;

    /**
     * 证件号码
     */
    @JacksonXmlProperty(localName = "IDCARD_NO")
    private String idcardNo;

    /**
     * 卡类型：
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
    @JacksonXmlProperty(localName = "CARD_TYPE")
    private Integer cardType;

    /**
     * 卡号
     */
    @JacksonXmlProperty(localName = "CARD_NO")
    private String cardNo;

    /**
     * 姓名
     */
    @JacksonXmlProperty(localName = "NAME")
    private String name;

    /**
     * 手机号码
     */
    @JacksonXmlProperty(localName = "MOBILE")
    private String mobile;

    /**
     * 性别：
     * F-女
     * M-男
     */
    @JacksonXmlProperty(localName = "SEX")
    private String sex;

    /**
     * 证件号码
     */
    @JacksonXmlProperty(localName = "BIRTHDAY")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private LocalDate birthday;

    /**
     * 用户注册渠道：
     * 1-微信
     * 2-支付宝
     */
    @JacksonXmlProperty(localName = "USER_TYPE")
    private Integer userType;

    /**
     * 渠道ID
     */
    @JacksonXmlProperty(localName = "OPEN_ID")
    private String openId;
}
