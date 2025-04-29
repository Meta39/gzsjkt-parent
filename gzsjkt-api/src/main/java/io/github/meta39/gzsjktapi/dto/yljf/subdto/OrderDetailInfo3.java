package io.github.meta39.gzsjktapi.dto.yljf.subdto;

import lombok.Data;

@Data
public final class OrderDetailInfo3 {
    /**
     * 缴费费别
     */
    private String detailFee;

    /**
     * 缴费细目流水号，要求唯一
     */
    private String detailID;

    /**
     * 缴费细目名称
     */
    private String detailName;

    /**
     * 缴费细目数量
     */
    private Integer detailCount;

    /**
     * 缴费细目单位
     */
    private String detailUnit;

    /**
     * 缴费细目金额，单位：分
     */
    private Long detailAmout;

    /**
     * 缴费规格
     */
    private String detailSpec;

    /**
     * 缴费细目单价，单位：分
     */
    private Long detailPrice;
}
