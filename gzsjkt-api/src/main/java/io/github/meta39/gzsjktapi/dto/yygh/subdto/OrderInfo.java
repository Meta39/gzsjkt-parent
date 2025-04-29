package io.github.meta39.gzsjktapi.dto.yygh.subdto;

import lombok.Data;

@Data
public final class OrderInfo {
    /**
     * 订单号
     */
    private String orderId;

    /**
     * 订单状态：
     * 0：未取号（爽约）
     * 1：已取号（就诊）
     * 2：已退费/未付费取消
     */
    private Integer orderStutes;

    /**
     * 是否需要退费：（默认按照不需要退费处理）
     * 0-不需要退费
     * 1-需要退费
     */
    private Integer isRefound;

    /**
     * 取消原因
     */
    private String concelReason;
}
