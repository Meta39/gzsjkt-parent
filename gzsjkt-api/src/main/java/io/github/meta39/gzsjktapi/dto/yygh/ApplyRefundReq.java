package io.github.meta39.gzsjktapi.dto.yygh;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * 异常订单退费申请接口（新流程必选）
 */
@Data
@JacksonXmlRootElement(localName = "req")
public final class ApplyRefundReq {
    /**
     * 医院代码
     */
    private String hospitalId;

    /**
     * 接口代码:
     * applyRefund001
     */
    private String methodCode;

    /**
     * 支付渠道：
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
    private Integer channel;

    /**
     * 患者支付宝或微信绑定号，对于没有个人openId，由系统发起的，统一传各自的channel（渠道）
     */
    private String openId;

    /**
     * 业务类型
     * 1：预约挂号缴费
     * 2：当班挂号缴费
     * 3：门诊缴费
     * 4：住院押金缴费
     */
    private Integer busType;

    /**
     * 第三方支付（微信、支付宝、银联）的交易流水号
     */
    private String orderPayId;

    /**
     * 卫计委平台的订单ID
     */
    private String orderId;

    /**
     * 退费金额：分
     */
    private Long refundAmount;

    /**
     * orderPayId 对应的交易时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime payTime;
}
