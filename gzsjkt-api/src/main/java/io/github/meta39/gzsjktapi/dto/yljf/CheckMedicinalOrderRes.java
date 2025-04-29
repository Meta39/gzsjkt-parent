package io.github.meta39.gzsjktapi.dto.yljf;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.github.meta39.gzsjktapi.dto.Res;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 处方订单校验接口
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@JacksonXmlRootElement(localName = "res")
public final class CheckMedicinalOrderRes extends Res {
    /**
     * 订单状态：
     * 1---(正常可支付状态)
     * 2---(不可以支付状态)
     */
    private Integer orderState;

    /**
     * 统筹订单号（如果使用医保移动支付该字段为必填项）
     */
    private String extOrderNo;

}
