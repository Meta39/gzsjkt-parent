package io.github.meta39.gzsjktdatp.yljf;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * 缴费退费接口（返回Res）
 */
@Data
@JacksonXmlRootElement(localName = "req")
public final class RefundPay2Req {

    /**
     * 医院代码
     */
    private String hospitalId;

    /**
     * 诊疗平台的订单号
     */
    private String orderId;

    /**
     * 医院退费订单号对于医院部分退费（妇儿部分退费）来说，平台订单号可能会对应多笔退费订单号。
     */
    private String hisOrderId;

    /**
     * 退费时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime refundTime;

    /**
     * 退费金额单位：分
     */
    private Long returnFee;

    /**
     * 退费原因
     */
    private String refundReason;

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
