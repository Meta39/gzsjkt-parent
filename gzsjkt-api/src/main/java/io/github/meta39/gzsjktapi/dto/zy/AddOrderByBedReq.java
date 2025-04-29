package io.github.meta39.gzsjktapi.dto.zy;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * 床位预约接口
 */
@Data
@JacksonXmlRootElement(localName = "req")
public final class AddOrderByBedReq {
    /**
     * 医院代码
     */
    private String hospitalId;

    /**
     * 诊疗平台的订单号
     */
    private String orderId;

    /**
     * 科室代码
     */
    private String deptId;

    /**
     * 床位代码
     */
    private String bedId;

    /**
     * 床位号源开始日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private LocalDate bedRegDate;

    /**
     * 预约时段
     * 1:上午
     * 2:下午
     * 3:晚上
     */
    private Integer timeFlag;

    /**
     * 患者证件类型：
     * 01-身份证
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
     * 患者手机号码(挂号类型为“2：为被监护人挂号”，则该字段允许为空，其他类型的挂号该字段不允许为空)
     */
    private String userMobile;

    /**
     * 患者出生日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private LocalDate userBirthday;

    /**
     * 预约方式
     * 0：网站
     * 1：12320（移动、联通、电信电话预约统一为：12320）
     * 3：自助终端
     * 4：手机客户端
     * 5：微信、WAP
     * 6：支付宝
     * 7:网办
     * 8:家庭医生
     * 9:电子健康码
     * 10：双向转诊系统
     */
    private Integer orderType;

    /**
     * 床位代码
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime orderTime;

    /**
     * 床位押金
     */
    private Long bedRegFee;

    /**
     * 患者住址
     */
    private String userAddress;

    /**
     * 用户地址ID，对于接入国际标准地址的医院，该字段必传，
     * 格式为xxxxxxxx|xxxxxxxx|xxxxxxxx|xxxxxxxxx。
     */
    private String userAddressId;

    /**
     * 患者手填社区/小区几楼几号信息
     */
    private String userAddressDet;

    /**
     * 用于区别于普通号源和特殊号源（该字段为家庭医生渠道必须项）
     * 1-普通号源
     * 2-家庭医生号源
     */
    @JacksonXmlProperty(localName = "SourceNumberType")
    private Integer sourceNumberType;

    /**
     * 诊断结果（家庭医生号源为必传字段）
     */
    private String diagnosticResults;

    /**
     * 病情等级
     * 0：一般
     * 1：急
     * 2：危重（家庭医生号源为必传字段）
     */
    private Integer illnessLevel;

    /**
     * 转诊原因类型
     * 0:病人强烈要求申请转
     * 1:医生能力不足申请转
     * 2:检查资源不足申请转
     * 3:药品资源不足申请转
     * 4:床位不足申请转
     * 5：其他原因申请转（家庭医生号源为必传字段）
     */
    private Integer reasonType;

    /**
     * 原因描述（家庭医生号源为必传字段）
     */
    private String reasonDesc;

}
