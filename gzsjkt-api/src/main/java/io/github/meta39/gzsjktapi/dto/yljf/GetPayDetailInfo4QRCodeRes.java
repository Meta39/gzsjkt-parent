package io.github.meta39.gzsjktapi.dto.yljf;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.github.meta39.gzsjktapi.dto.Res;
import io.github.meta39.gzsjktapi.dto.yljf.subdto.PresList;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.List;

/**
 * 二维码订单明细接口
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@JacksonXmlRootElement(localName = "res")
public final class GetPayDetailInfo4QRCodeRes extends Res {
    /**
     * 支付类型：
     * O----自费
     * M----医保
     * G----公医
     */
    private String payStyle;

    /**
     * 处方显示总费用(如果自费，totalAmout 与payAmout 的金额应该一致)，单位：分
     */
    private Long totalAmout;

    /**
     * 实际需要支付的费用，单位：分
     */
    private Long payAmout;

    /**
     * 处方集合
     */
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<PresList> presList;
}
