package io.github.meta39.gzsjktapi.dto.yljf;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

/**
 * 二维码订单明细接口
 */
@Data
@JacksonXmlRootElement(localName = "req")
public final class GetPayDetailInfo4QRCodeReq {
    /**
     * 医院代码
     */
    private String hospitalId;

    /**
     * HIS 系统中订单号，要求唯一。如：12345
     */
    private String orderIdHIS;

    /**
     * 挂号系统的订单号
     */
    private String orderId;

}
