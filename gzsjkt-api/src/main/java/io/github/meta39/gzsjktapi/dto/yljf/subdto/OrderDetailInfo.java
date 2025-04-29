package io.github.meta39.gzsjktapi.dto.yljf.subdto;

import lombok.Data;

@Data
public final class OrderDetailInfo {
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

    /**
     * 是否为特殊（无创NIPT）检查项目符合人群
     * 1-是
     * 0 或者空-否
     * 注：payType=2 时必传
     */
    private Integer isNipt;
}
