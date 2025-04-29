package io.github.meta39.gzsjktdatp.yygh;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * 退费接口（和取消接口合并，退号）（返回Res）
 */
@Data
@JacksonXmlRootElement(localName = "req")
public class RefundPayReq {
    /**
     * 医院代码
     */
    private String hospitalId;

    /**
     * 诊疗平台或者诊疗平台的订单号
     */
    private String orderId;

    /**
     * 退费类型
     * 1- 停诊退费
     * 2- 用户申请退费
     */
    private String refundType;

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
     * 透传医保局（医保退款必填）
     */
    private String requestContent;

    /**
     * 撤销流水号医保退款必填，医保局无要求则由医院自定义（医保退款必填）
     */
    private String cancelSerialNo;

    /**
     * 医院退费订单号（医保退款必填）
     */
    private String hisOrderId;

}
