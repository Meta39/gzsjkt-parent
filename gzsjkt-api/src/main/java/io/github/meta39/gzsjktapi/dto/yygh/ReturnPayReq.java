package io.github.meta39.gzsjktapi.dto.yygh;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * 退费接口
 */
@Data
@JacksonXmlRootElement(localName = "req")
public final class ReturnPayReq {
    /**
     * 医院代码
     */
    private String hospitalId;

    /**
     * 诊疗平台或者诊疗平台的订单号
     */
    private String orderId;

    /**
     * 退费流水号
     */
    private String orderIdPAY;

    /**
     * 退费金额(单位“分”)
     */
    private Long returnFee;

    /**
     * 诊疗平台或者诊疗平台的订单号
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime returnTime;

    /**
     * 退费原因
     */
    private String returnReason;

    /**
     * 交易响应代码如果是银联支付则具体参见银联文档；如果是手机支付则需要12580 给出描述。
     */
    private String payRespCode;

    /**
     * 交易响应描述
     */
    private String payRespDesc;
}
