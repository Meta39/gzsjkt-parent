package io.github.meta39.gzsjktapi.dto.yljf.subdto;

import lombok.Data;

@Data
public final class OrderDetailInfo2 {

    /**
     * 缴费细目流水号，要求唯一
     */
    private String detailID;

    /**
     * 操作员工号
     */
    private String oprId;

    /**
     * 第三方平台的流水号（银联流水号）如果支付方式为终端银联等线下支付方式，则该字段对应POS 打印单中参考号，
     * 如果为网站银联、手机银联、微信支付、支付宝支付等线上支付方式，则该字段对应银联或者微信支付、支付宝支付等平台的流水号
     */
    private String orderIdPAY;

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
     * 就诊卡（可代替健康卡，医保卡，市民卡，缴费新流程）
     */
    private String medicalCard;

}
