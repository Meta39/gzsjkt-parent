package io.github.meta39.gzsjktapi.dto.yygh;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.github.meta39.gzsjktapi.dto.Res;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 异常订单退费申请接口（新流程必选）
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@JacksonXmlRootElement(localName = "res")
public final class ApplyRefundRes extends Res {
    /**
     * 微信、支付宝商户号生成的交易流水号
     */
    private String orderPayId;

    /**
     * 第三方平台生成的订单ID
     */
    private String orderId;

    /**
     * 是否可退
     * Y-是
     * N-否
     */
    private String canRefund;

    /**
     * 撤销流水号医保退款必填，医保局无要求则由医院自定义
     */
    private String cancelSerialNo;

    /**
     * 医保诊间退款必填,医保局无要求则由医院自定义
     */
    private String cancelBillNo;

    /**
     * 透传医保局
     */
    private String requestContent;

}
