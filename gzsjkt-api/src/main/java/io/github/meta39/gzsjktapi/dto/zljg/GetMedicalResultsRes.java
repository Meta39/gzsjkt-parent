package io.github.meta39.gzsjktapi.dto.zljg;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.github.meta39.gzsjktapi.dto.Res;
import io.github.meta39.gzsjktapi.dto.zljg.subdto.OrderDetailInfo5;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.List;

/**
 * 获取医疗结果查询接口
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@JacksonXmlRootElement(localName = "res")
public final class GetMedicalResultsRes extends Res {
    /**
     * 诊断结果（家庭医生订单为必传字段）
     */
    private String diagnosticResults;

    /**
     * 病史摘要（家庭医生订单为必传字段）
     */
    private String medicalSummary;

    /**
     * 主要既往史（家庭医生订单为必传字段）
     */
    private String medicalHistory;

    /**
     * 治疗情况（家庭医生订单为必传字段）
     */
    private String treatmentSituation;

    /**
     * 转诊目的（家庭医生订单为必传字段）
     */
    private String referralPurpose;

    /**
     * 处方明细集合（家庭医生订单为必传字段）
     */
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<OrderDetailInfo5> orderDetailInfo;
}
