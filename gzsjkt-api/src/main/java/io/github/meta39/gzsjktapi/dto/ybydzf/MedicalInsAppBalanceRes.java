package io.github.meta39.gzsjktapi.dto.ybydzf;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.github.meta39.gzsjktapi.dto.Res;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 医保个账金额查询（预结算/统筹结算）
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@JacksonXmlRootElement(localName = "res")
public final class MedicalInsAppBalanceRes extends Res {
    /**
     * HIS 系统中就诊登记号（内部ID），要求唯一。如：12345
     */
    private String infoSeq;

    /**
     * 处方记账总金额（分）
     */
    private Long totalAmt;

    /**
     * 医保统筹金额（分）
     */
    private Long overAllAmt;

    /**
     * 医保个账金额（分）
     */
    private Long payedAmt;

    /**
     * 预交金（分）（如果医院无此项传0）
     */
    private Long retAmt;

    /**
     * 应付金额（分）（实际支付金额）
     */
    private Long payAmt;

    /**
     * 统筹订单号（medInsFaceType = 1 统筹结算必传）
     */
    private String extOrderNo;
}
