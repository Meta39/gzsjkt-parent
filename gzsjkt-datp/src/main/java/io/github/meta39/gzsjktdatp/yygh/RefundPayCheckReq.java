package io.github.meta39.gzsjktdatp.yygh;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * 退费预检查接口（返回Res）
 */
@Data
@JacksonXmlRootElement(localName = "req")
public class RefundPayCheckReq {
    /**
     * 医院代码
     */
    private String hospitalId;

    /**
     * 诊疗平台的订单号
     */
    private String orderId;

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
}
