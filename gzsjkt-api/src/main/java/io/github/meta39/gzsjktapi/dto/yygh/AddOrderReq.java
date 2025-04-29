package io.github.meta39.gzsjktapi.dto.yygh;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * 挂号接口(支持医保)
 */
@Data
@JacksonXmlRootElement(localName = "req")
public final class AddOrderReq {

    /**
     * 诊疗平台或者诊疗平台的订单号
     * （锁号接口的号源锁定ID）
     */
    private String orderId;

    /**
     * 医院代码
     */
    private String hospitalId;

    /**
     * 科室代码
     */
    private String deptId;

    /**
     * 医生代码
     */
    private String doctorId;

    /**
     * 预约日期
     * 格式：yyyy-MM-dd
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private LocalDate regDate;

    /**
     * 预约时段
     * 1:上午
     * 4:中午
     * 2:下午
     * 3:晚上
     */
    private Integer timfFlag;

    /**
     * 分时开始时间
     * 格式：HH:mm
     */
    private String startTime;

    /**
     * 分时结束时间
     * 格式：HH:mm
     */
    private String endTime;

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
     * 电子健康码动态原始数据，用于医院通过电子健康卡管理平台校验用户身份，如用户已经绑定电子健康卡，该字段为必传字段。（当前阶段只提供为本人挂号模式）
     */
    private String userJKKQRcode;

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
     * 医生停诊时订单处理方式（默认进行退费处理）
     * 1-换医生
     * 2-退费
     */
    private String userChoice;

    /**
     * 座席工号
     */
    private String agentId;

    /**
     * 预约方式
     * 0：网站
     * 1：12320（移动、联通、电信电话预约统一为：12320）
     * 3：自助终端
     * 4：手机客户端5：微信、WAP
     * 6：支付宝
     * 7:网办
     * 8:家庭医生
     * 9:电子健康码
     */
    private Integer orderType;

    /**
     * 下订单时间
     * 格式：yyyy-MM-dd HH:mm:ss
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime orderTime;

    /**
     * 挂号费
     */
    private Long fee;

    /**
     * 患者住址
     */
    private String userAddress;

    /**
     * 用户地址 ID，对于接入国际标准地址的医院，该字段必传
     * 格式为xxxxxxxx|xxxxxxxx|xxxxxxxx|xxxxxxxxx。
     */
    private String userAddressId;

    /**
     *  患者手填社区/小区几楼几号信息
     */
    private String userAddressDet;

    /**
     * 诊查费(单位“分”)
     */
    private Long treatFee;

    /**
     * 医院就诊卡（可以是虚拟卡号，his能够识别），传参可为空。
     * 对于集约系统首诊用户，该卡号为空；
     * 当用户复诊时，平台将上次就诊卡号推送给HIS。
     */
    private String medicalCard;

    /**
     * 指定挂自费号标志：
     * 0- 不指定挂自费号
     * 1-指定挂自费号，可为空（特供与省人医使用）
     */
    private Integer registerFlag;

    /**
     * 用户医保类型代码，平台自定义代码（特供与省人医使用不对外开放，如果需要同样功能请传medCode 参数）
     */
    private String userType;

    /**
     * 医保类型代码，医院内部定义代码(医保模式下为必须项）
     */
    private Integer medCode;

    /**
     * 证件号预留字段（特供与省人医使用）
     */
    private String userYLZ;

    /**
     * 1-普通号源（预约系统所有渠道通用）
     * 2：家庭医生号源（如需把号源提供至分级诊疗平台，该字段必传）
     */
    @JacksonXmlProperty(localName = "SourceNumberType")
    private Integer sourceNumberType;

    /**
     * 诊断结果（家庭医生号源为必传字段）
     */
    private String diagnosticResults;

}
