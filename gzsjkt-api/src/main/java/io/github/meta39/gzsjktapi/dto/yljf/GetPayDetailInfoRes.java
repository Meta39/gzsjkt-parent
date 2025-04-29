package io.github.meta39.gzsjktapi.dto.yljf;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.github.meta39.gzsjktapi.dto.Res;
import io.github.meta39.gzsjktapi.dto.yljf.subdto.OrderDetailInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.List;

/**
 * 待缴费明细查询接口
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@JacksonXmlRootElement(localName = "res")
public final class GetPayDetailInfoRes extends Res {
    /**
     * 用户姓名
     */
    private String userName;

    /**
     * HIS 就诊登记号
     */
    private String infoSeq;

    /**
     * 本次支付总金额，单位：分
     * 用于支付时使用，是HIS 计算扣除医保费用之后的费用，没有医保的则 = totalAmout
     */
    private Long payAmout;

    /**
     * 收据号
     */
    private String receiptId;

    /**
     * 处方总金额 = detailAmout 的总和这个金额是本处方的总金额
     */
    private Long totalAmout;

    /**
     * 医疗保险类型：
     * 自费---O
     * 医保---M
     * 以医院返回为准，返回中文，当为空时显示自费
     */
    private String medicalInsuranceType;

    /**
     * 医保类型（新移动医保支付）医保订单必填
     * 68：自费
     * 414：市医保
     * 415：省直医保
     * 419：市直医保
     */
    private Integer medCode;

    /**
     * 医保类型名称（新移动医保支付）医保订单必填
     */
    private String medCodeName;

    /**
     * 缴费订单明细集合注释：在妇儿医院若该患者为医保类型时，此节点可为空。若为自费则必传。当明细为空时不返回这一节点
     */
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<OrderDetailInfo> orderDetailIn;
}
