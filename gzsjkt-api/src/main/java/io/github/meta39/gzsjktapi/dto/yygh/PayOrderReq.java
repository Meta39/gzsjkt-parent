package io.github.meta39.gzsjktapi.dto.yygh;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * 挂号支付
 */
@Data
@JacksonXmlRootElement(localName = "req")
public final class PayOrderReq {
    /**
     * 诊疗平台订单号，卫生局的订单号
     */
    private String orderId;

    /**
     * 第三方平台的流水号（银联流水号）如果支付方式为终端银联等线下支付方式，则该字段对应POS 打印单中参考号，
     * 如果为网站银联、手机银联、微信支付、支付宝支付等线上支付方式，则该字段对应银联或者微信支付、支付宝支付等平台的流水号
     */
    private String orderIdPAY;

    /**
     * 用户健康卡号码
     */
    private String userJKK;

    /**
     * 诊疗平台流水号，卫生局的流水号
     */
    private String payCardNum;

    /**
     * 支付金额(单位“分”)
     */
    private Long payAmout;

    /**
     * 支付方式：
     * 1-网站银联
     * 2-手机银联
     * 3-羊城通
     * 4-终端银联
     * 5-12320 支付
     * 6-窗口支付
     * 7-健康卡
     * 8-数字电视金卡
     * 9-微信支付
     * 10-支付宝支付
     * 11-医保支付
     */
    private Integer payMode;

    /**
     * 交易时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime payTime;

    /**
     * 交易响应代码如果是银联支付则具体参见银联文档；如果是手机支付则需要12580 给出描述。
     */
    private String payRespCode;

    /**
     * 交易响应描述
     */
    private String payRespDesc;

    /**
     * 商户号，对应支付方式的商户号
     */
    private String merchantId;

    /**
     * 终端号，当支付方式为终端银联等线下支付方式时，该项必输
     */
    private String terminalId;

    /**
     * 银行卡号，当支付方式为终端银联等线下支付方式时，该项必输
     */
    private String bankCardNum;

    /**
     * 就诊卡（可代替健康卡，医保卡，市民卡）
     */
    private String medicalCard;

}
