package io.github.meta39.gzsjktapi.dto.yjfw;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.github.meta39.gzsjktapi.dto.yjfw.subdto.PaySortDetail;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

/**
 * 医技服务部分支付接口
 */
@Data
@JacksonXmlRootElement(localName = "req")
public final class GetServerOrderReq {
    /**
     * 诊疗平台订单号
     */
    private String orderId;

    /**
     * 患者证件类型：
     * 0-无证件
     * 01-身份证
     * 02-港澳来往内地通行证（回乡证）
     * 03-台湾来往大陆通行证（台胞证）
     * 04-护照
     * 14 港澳居民居住证
     * 15-台湾居民居住证
     * 99-外国人永久居留身份证
     */
    private String userIdType;

    /**
     * 患者身份证件号码
     */
    private String userIdCard;

    /**
     * 患者姓名
     */
    private String userName;

    /**
     * 患者性别：
     * M-男性
     * F-女性
     */
    private String userGender;

    /**
     * 患者手机号码
     */
    private String userMobile;

    /**
     * 患者出生日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private LocalDate userBirthday;

    /**
     * 患者住址
     */
    private String userAddress;

    /**
     * 用户地址ID，对于接入国际标准地址的医院，该字段必传
     * 格式为xxxxxxxx|xxxxxxxx|xxxxxxxx|xxxxxxxxx。
     */
    private String userAddressId;

    /**
     * 患者手填社区/小区几楼几号信息
     */
    private String userAddressDet;

    /**
     * 第三方平台的流水号（银联流水号）如果支付方式为终端银联等线下支付方式，则该字段对应POS 打印单中参考号，
     * 如果为网站银联、手机银联、微信支付、支付宝支付等线上支付方式，则该字段对应银联或者微信支付、支付宝支付等平台的流水号
     */
    private String orderIdPAY;

    /**
     * 支付金额(单位“分”)
     */
    private Long payAmout;

    /**
     * 支付方式：
     * 1-网站银联
     * 2-手机银联
     * 9-微信支付
     * 10-支付宝支付
     * 11-医保支付
     */
    private Integer payMode;

    /**
     * 支付类目
     * 1-居家护理预约
     * 2-其他
     */
    private Integer paySort;

    /**
     * 商品描述
     */
    private String paySortDesc;

    /**
     * 支付商品明细
     */
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<PaySortDetail> paySortDetail;

}
