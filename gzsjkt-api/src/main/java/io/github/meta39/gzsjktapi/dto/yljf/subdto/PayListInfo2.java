package io.github.meta39.gzsjktapi.dto.yljf.subdto;

import lombok.Data;

@Data
public final class PayListInfo2 {

    /**
     * HIS 就诊登记号HIS 系统中就诊登记号（内部ID），要求唯一。如：12345
     */
    private String infoSeq;

    /**
     * HIS 流水号备注说明HIS 系统中就诊登记号的显式信息，如：2012-3-1/123（代表挂号日期为2012-3-1，流水号为123）
     */
    private String infoRmk;

    /**
     * 接诊专科名称
     */
    private String deptName;

    /**
     * 接诊医生姓名
     */
    private String doctorName;

    /**
     * 已缴费总金额，单位：分
     */
    private Long payAmout;

    /**
     * 支付方式：
     * 1-网站银联
     * 2-手机银联
     * 3-羊城通
     * 4-终端银联
     * 5-12580 银联
     * 6-窗口支付
     * 7-健康卡
     * 8-数字电视金卡
     * 9-微信支付
     * 10-支付宝支付
     */
    private Integer payMode;

    /**
     * 订单状态：
     * 1-未支付
     * 2-已支付
     * 3-已退费
     */
    private Integer status;

    /**
     * 收据ID
     */
    private String receiptID;

}
