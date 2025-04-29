package io.github.meta39.gzsjktdatp.yygh;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * 取消预约接口（返回Res）
 */
@Data
@JacksonXmlRootElement(localName = "req")
public class CancelOrderbyHisReq {

    /**
     * 诊疗平台的订单号
     */
    private String orderId;

    /**
     * 停诊开始日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime cancelTime;

    /**
     * 取消原因
     */
    private String cancelReason;
    
}
