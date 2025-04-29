package io.github.meta39.gzsjktdatp.yygh;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

/**
 * 订单查询接口（看 his 需求而定，用于 HIS 查询集约平台订单状态）
 */
@Data
@JacksonXmlRootElement(localName = "req")
public final class OrderQueryReq {

    /**
     * 医院代码
     */
    private String hospitalId;

    /**
     * 诊疗平台的订单号
     */
    private String orderId;

    /**
     * 支付流水
     */
    private String orderIdPAY;

    /**
     * 退费流水
     */
    private String orderIdPAYrefund;

    /**
     * 退费订单号
     */
    private String orderIdrefund;
    
}
