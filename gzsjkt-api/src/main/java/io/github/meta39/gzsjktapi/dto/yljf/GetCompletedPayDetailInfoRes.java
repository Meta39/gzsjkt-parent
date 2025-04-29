package io.github.meta39.gzsjktapi.dto.yljf;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.github.meta39.gzsjktapi.dto.Res;
import io.github.meta39.gzsjktapi.dto.yljf.subdto.OrderDetailInfo3;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.List;

/**
 * 已缴费记录明细查询接口
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@JacksonXmlRootElement(localName = "res")
public final class GetCompletedPayDetailInfoRes extends Res {
    /**
     * 处方总金额 = detailAmout 的总和这个金额是本处方的总金额
     */
    private Long totalAmout;

    /**
     * 自费金额本次支付总金额，单位：分用于支付时使用，是HIS 计算扣除医保费用之后的费用，没有医保的则 = totalAmout
     */
    private Long payAmout;

    /**
     * 缴费订单明细集合
     */
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<OrderDetailInfo3> orderDetailInfo;
}
