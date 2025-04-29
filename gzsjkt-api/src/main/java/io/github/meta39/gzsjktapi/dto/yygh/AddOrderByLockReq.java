package io.github.meta39.gzsjktapi.dto.yygh;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * 挂号接口(用于电话预约)
 */
@Data
@JacksonXmlRootElement(localName = "req")
public final class AddOrderByLockReq {
    /**
     * 号源锁定ID（诊疗平台产生）
     */
    private String lockId;

    /**
     * 诊疗平台的订单号
     */
    private String orderId;

    /**
     * 挂号类型：
     * 1：为本人挂号
     * 2：为子女挂号
     * 3：为他人挂号
     */
    private Integer regType;

    /**
     * 患者证件类型：（暂时只华侨医院和妇儿中心使用）
     * 0-无证件
     * 01-身份证
     * 02-港澳来往内地通行证（回乡证）
     * 03-台湾来往大陆通行证（台胞证）
     * 04-护照
     * 14-港澳居民居住证
     * 15-台湾居民居住证
     */
    private String userIdType;

    /**
     * 患者证件号码(挂号类型为“2：为子女挂号或3：为他人挂号”，则该字段允许为空，挂号类型为“1：为本人挂号”不允许为空)
     */
    private String userIdCard;

    /**
     * 患者健康卡号码
     */
    private String userJKK;

    /**
     * 患者市民卡号码
     */
    private String userSMK;

    /**
     * 患者医保卡号码
     */
    private String userYBK;

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
     * 患者出生
     * 日期：yyyy-MM-dd
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private LocalDate userBirthday;

    /**
     * 挂号人证件类型：（暂时只华侨医院和妇儿中心使用）
     * 0-无证件
     * 01-身份证
     * 02-港澳来往内地通行证
     * 03-台湾来往大陆通行证
     */
    private String operIdType;

    /**
     * 挂号人身份证号码
     */
    private String operIdCard;

    /**
     * 挂号人姓名
     */
    private String operName;

    /**
     * 挂号人手机号码
     */
    private String operMobile;

    /**
     * 座席工号
     */
    private String agentId;

    /**
     * 1-换医生
     * 2-退费
     */
    private Integer userChoice;

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
     * 患者住址
     */
    private String userAddress;

    /**
     * 下订单时间
     * 格式：yyyy-MM-dd HH:mm:ss
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime orderTime;
}
