package io.github.meta39.gzsjktapi.dto.yjfw.subdto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public final class PaySortDetail {
    /**
     * 商品编号
     */
    private String paySortNo;

    /**
     * 商品名称
     */
    private String paySortName;

    /**
     * 商品规格
     */
    private String paySortSpec;

    /**
     * 商品单价
     */
    private String paySortPrice;

    /**
     * 商品总价
     */
    private String paySortTotalPrice;

    /**
     * 商品数量
     */
    private String paySortTotalNum;

    /**
     * 交易时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime payTime;

    /**
     * 商户号，对应支付方式的商户号
     */
    private String merchantId;
}
