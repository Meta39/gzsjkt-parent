package io.github.meta39.gzsjktapi.dto.yljf;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

/**
 * 处方订单校验接口
 */
@Data
@JacksonXmlRootElement(localName = "req")
public final class CheckMedicinalOrderReq {
    /**
     * 医院代码
     */
    private String hospitalId;

    /**
     * 实际需要支付的费用，单位：分
     */
    private Long payAmout;

    /**
     * 用户身份证
     */
    private String identityCard;

    /**
     * HIS 系统中订单号，要求唯一。如：12345
     */
    private String orderIdHIS;

    /**
     * 姓名
     */
    private String userName;

}
