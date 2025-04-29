package io.github.meta39.gzsjktapi.dto.yygh;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * 取号接口（用于自助终端）
 */
@Data
@JacksonXmlRootElement(localName = "req")
public final class InfoOrderReq {
    /**
     * 诊疗平台的订单号
     */
    private String orderId;

    /**
     * 通知取号时间
     */
    @JacksonXmlProperty(localName = "InfoTime")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime infoTime;
}
