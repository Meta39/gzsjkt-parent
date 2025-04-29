package io.github.meta39.gzsjktapi.dto.yljf.subdto;

import lombok.Data;

@Data
public final class PayListInfo {

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
     * 未缴费总金额，单位：分
     */
    private Long totalAmout;

    /**
     * 是否为特殊（无创NIPT）检查项目符合人群
     * 1-是
     * 0 或者空-否
     * 注：payType=2 时必传
     */
    private Integer isNipt;

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
}
