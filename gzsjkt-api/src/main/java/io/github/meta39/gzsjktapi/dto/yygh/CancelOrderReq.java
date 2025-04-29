package io.github.meta39.gzsjktapi.dto.yygh;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * 取消预约（接口实现返回对象填Void）
 */
@Data
@JacksonXmlRootElement(localName = "req")
public final class CancelOrderReq {
    /**
     * 诊疗平台的订单号
     */
    private String orderId;

    /**
     * 诊疗平台的订单号
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime cancelTime;

    /**
     * 取消原因
     */
    private String cancelReason;
}
