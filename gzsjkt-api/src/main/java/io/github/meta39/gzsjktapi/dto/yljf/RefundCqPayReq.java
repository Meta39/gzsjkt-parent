package io.github.meta39.gzsjktapi.dto.yljf;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * 退费接口（可选）（接口实现返回对象填Void）
 */
@Data
@JacksonXmlRootElement(localName = "req")
public final class RefundCqPayReq {
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
     * 退费时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime returnTime;

    /**
     * 退费原因
     */
    private String returnReason;
}
