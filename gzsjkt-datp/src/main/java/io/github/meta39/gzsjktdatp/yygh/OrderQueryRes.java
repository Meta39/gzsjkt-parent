package io.github.meta39.gzsjktdatp.yygh;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.github.meta39.gzsjktdatp.Res;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * 订单查询接口（看 his 需求而定，用于 HIS 查询集约平台订单状态）
 */
@Data
@EqualsAndHashCode(callSuper = true)
@JacksonXmlRootElement(localName = "res")
public class OrderQueryRes extends Res {

    /**
     * 诊疗平台订单号
     */
    private String orderId;

    /**
     * 诊疗平台退费订单号（当发起退费时才会产生退费订单号）
     */
    private String refundId;

    /**
     * 第三方平台的支付订单流水号（银联流水号）如果为网站银联、手机银联、微信支付、支付宝支付等线上支付方式，
     * 则该字段对应银联或者微信支付、支付宝支付等平台的流水号。
     */
    private String orderIdPAY;

    /**
     * 若该笔订单为退费，则为第三方平台的退费订单流水号流水号（银联流水号）如果为网站银联、手机银联、微信支付、支付宝支付等线上支付方式，
     * 则该字段对应银联或者微信支付、支付宝支付等平台的流水号。
     */
    private String orderIdrefund;

    /**
     * 身份证号
     */
    private String userIdCard;

    /**
     * 用户姓名
     */
    private String userName;

    /**
     * 用户手机
     */
    private String mblNo;

    /**
     * 科室ID
     */
    private String depId;

    /**
     * 医生ID
     */
    private String docId;

    /**
     * 订单状态
     * U：订单初始状态
     * H：待银联支付状态
     * P：订单在银联支付成功（对于预付费医院）
     * S：挂号成功（银联支付成功，且通知医院付费成功，对于预付费医院）
     * W:申请退费
     * T:退费成功
     * G：取号成功
     * R：取消订单（付费超时，用户主动取消）
     */
    private String orderStatus;

    /**
     * 支付金额(单位“分”)
     */
    private Long payAmout;

    /**
     * 支付方式：
     * 1-网站银联
     * 2-手机银联
     * 3-羊城通
     * 4-终端银联
     * 5-12320 支付
     * 6-窗口支付
     * 7-健康卡
     * 8-数字电视金卡
     * 9-微信支付
     * 10-支付宝支付
     */
    private Integer payMode;

    /**
     * 预约方式
     * 0：网站
     * 1：12320（移动、联通、电信电话预约统一为：12320）
     * 3：自助终端
     * 4：手机客户端
     * 5：微信、WAP
     * 6：支付宝
     */
    private Integer orderType;

    /**
     * 订单生成日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private LocalDate createDate;

    /**
     * 交易日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private LocalDate txData;

    /**
     * 交易时间
     */
    @JsonFormat(pattern = "HH:mm:ss", timezone = "GMT+8")
    private LocalTime txTime;

    /**
     * 预约日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private LocalDate regDate;

    
}
