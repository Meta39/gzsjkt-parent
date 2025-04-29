package io.github.meta39.gzsjktdatp.yygh;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * 窗口支付（取号）接口（返回Res）
 */
@Data
@JacksonXmlRootElement(localName = "req")
public final class PayOrderByHisReq {

    /**
     * 诊疗平台的订单号
     */
    private String orderId;

    /**
     * 支付金额(单位“分”)
     */
    private Long payAmout;

    /**
     * 停诊开始日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime payTime;

}
