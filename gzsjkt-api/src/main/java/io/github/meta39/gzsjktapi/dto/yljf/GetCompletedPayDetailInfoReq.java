package io.github.meta39.gzsjktapi.dto.yljf;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

/**
 * 已缴费记录明细查询接口
 */
@Data
@JacksonXmlRootElement(localName = "req")
public final class GetCompletedPayDetailInfoReq {
    /**
     * 医院代码
     */
    private String hospitalId;

    /**
     * 缴费类型
     * 1 或空-普通医疗处方缴费
     * 2-产前筛查处方缴费
     */
    private Integer payType;

    /**
     * HIS 就诊登记号HIS 系统中就诊登记号（内部ID），要求唯一。如：12345
     */
    private String infoSeq;

    /**
     * 收据ID
     */
    private String receiptID;

    /**
     * 就诊卡（可代替健康卡，医保卡，市民卡）
     */
    private String medicalCard;

}
