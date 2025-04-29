package io.github.meta39.gzsjktapi.dto.yygh;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

/**
 * 取号(订单)查询
 */
@Data
@JacksonXmlRootElement(localName = "req")
public final class GetInfoOrderReq {
    /**
     * 医院代码
     */
    private String hospitalId;


    /**
     * 诊疗平台订单号
     */
    private String orderId;

}
