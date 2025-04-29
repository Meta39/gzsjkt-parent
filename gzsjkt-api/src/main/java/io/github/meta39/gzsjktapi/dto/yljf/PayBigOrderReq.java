package io.github.meta39.gzsjktapi.dto.yljf;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.github.meta39.gzsjktapi.dto.yljf.subdto.OrderDetailInfo2;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

/**
 * 待缴费记录支付接口
 */
@Data
@JacksonXmlRootElement(localName = "req")
public final class PayBigOrderReq {
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
     * 用户健康卡号码若不支持新流程则，当前为必输项(还不支付医保卡及市民卡的查询)
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
     * HIS 就诊登记号（妇儿流程）
     */
    private String infoSeq;

    /**
     * 支付平台订单号，卫生局的订单号
     */
    private String orderId;

    /**
     * 支付平台流水号，卫生局的流水号
     */
    private String payCardNum;

    /**
     * 支付金额(单位“分”
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
     * 11-医保个账支付
     * 12-省医保支付
     */
    private Integer payMode;

    /**
     * 交易时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime payTime;

    /**
     * 医保支付金额(单位“分”)医保必传
     */
    private Long insurancFee;

    /**
     * 医保个账部分(单位“分”)
     */
    private Long insuranceSelfFee;

    /**
     * 医保统筹部分(单位“分”)
     */
    private Long insuranceFundFee;

    /**
     * 医保其他部分(单位“分”)
     */
    private Long insuranceOtherFee;

    /**
     * 医保局支付成功后返回内容
     */
    private String responseContent;

    /**
     * 医保单据号
     */
    private String billNo;

    /**
     * 收据号
     */
    private String receiptId;

    /**
     * 处方总金额 = detailAmout 的总和这个金额是本处方的总金额
     */
    private Long totalAmout;

    /**
     * 缴费订单明细集合
     */
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<OrderDetailInfo2> orderDetailInfo;

}
