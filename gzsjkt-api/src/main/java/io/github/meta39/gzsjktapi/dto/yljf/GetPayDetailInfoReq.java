package io.github.meta39.gzsjktapi.dto.yljf;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

/**
 * 待缴费明细查询接口
 */
@Data
@JacksonXmlRootElement(localName = "req")
public final class GetPayDetailInfoReq {
    /**
     * 医院代码
     */
    private String hospitalId;

    /**
     * 身份证件号码
     */
    private String userIdCard;

    /**
     * 缴费类型
     * 1 或空-普通医疗处方缴费
     * 2-产前筛查处方缴费
     */
    private Integer payType;

    /**
     * 用户健康卡号码若不支持新流程则，当前为必输项( 还不支付医保卡及市民卡的查询)
     */
    private String userJKK;

    /**
     * 用户医保卡号码
     */
    private String userYBK;

    /**
     * 用户市民卡号码
     */
    private String userSMK;

    /**
     * HIS 就诊登记号
     */
    private String infoSeq;

    /**
     * 医疗保险类型：
     * 自费---O
     * 医保---M
     * 以医院返回为准，返回中文，当为空时显示自费
     */
    private String medicalInsuranceType;

    /**
     * 医院就诊卡（可以是虚拟卡号，his能够识别）。对于集约系统首诊用户，该卡号为空；当用户复诊时，平台将上次就诊卡号推送给HIS。
     */
    private String medicalCard;

    /**
     * 电子健康码动态原始数据，用于医院通过电子健康卡管理平台校验用户身份，如用户已经绑定电子健康卡，该字段为必传字段。（当前阶段只提供为本人模式）
     */
    private String userJKKQRcode;


}
