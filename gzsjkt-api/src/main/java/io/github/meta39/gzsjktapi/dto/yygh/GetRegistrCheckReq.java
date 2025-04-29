package io.github.meta39.gzsjktapi.dto.yygh;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * 就诊报到接口
 */
@Data
@JacksonXmlRootElement(localName = "req")
public final class GetRegistrCheckReq {
    /**
     * 医院代码
     */
    private String hospitalId;

    /**
     * 诊疗平台订单号
     */
    private String orderId;

    /**
     * 报到时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime checkTime;

}
