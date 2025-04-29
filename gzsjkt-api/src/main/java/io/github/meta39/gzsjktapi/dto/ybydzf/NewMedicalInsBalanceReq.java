package io.github.meta39.gzsjktapi.dto.ybydzf;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

/**
 * 腾讯医保-医院预结算接口
 */
@Data
@JacksonXmlRootElement(localName = "req")
public final class NewMedicalInsBalanceReq {
    /**
     * 医院代码
     */
    private String hospitalId;

    /**
     * 统筹结算接口:
     * 1 挂号
     * 2 缴费
     */
    @JacksonXmlProperty(localName = "pay_type")
    private Integer payType;

    /**
     * HIS 系统中就诊登记号
     */
    @JacksonXmlProperty(localName = "his_ord_no")
    private String hisOrdNo;

    /**
     * 医保类型（新移动医保支付）医保订单必填
     * 68：自费
     * 414：市医保
     * 415：省直医保
     * 419：市直医保
     */
    private String medCode;

}
