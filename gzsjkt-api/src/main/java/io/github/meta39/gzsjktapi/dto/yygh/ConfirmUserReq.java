package io.github.meta39.gzsjktapi.dto.yygh;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

import java.time.LocalDate;

/**
 * 医院用户信息确认接口（可选）
 */
@Data
@JacksonXmlRootElement(localName = "req")
public final class ConfirmUserReq {
    /**
     * 医院代码
     */
    private String hospitalId;

    /**
     * 用户类型：
     * 1：大人
     * 2：小孩
     */
    private Integer userType;

    /**
     * 用户证件类型（当用户类型为1 大人时，该项必输）
     * 01：身份证
     */
    private String userIdType;

    /**
     * 用户证件号码（当用户证件类型不为空时，该项必输）
     */
    private String userIdCard;

    /**
     * 用户姓名
     */
    private String userName;

    /**
     * 用户性别：
     * M-男性
     * F-女性
     */
    private String userGender;

    /**
     * 证件发证日期
     */
    private String issDate;

    /**
     * 用户手机号码（当用户类型为1 大人时，该项必输）
     */
    private String userMobile;

    /**
     * 用户出生日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private LocalDate userBirthday;

    /**
     * 用户地址
     */
    private String userAddress;

    /**
     * 用户监护人证件类型（当用户类型为2 小孩时，该项必输）：
     * 01：身份证
     */
    private String userParentIdType;

    /**
     * 用户监护人证件号码（当用户类型为2 小孩时，该项必输）
     */
    private String userParentIdCard;

    /**
     * 用户监护人姓名（当用户类型为2 小孩时，该项必输）
     */
    private String userParentName;

    /**
     * 用户监护人手机号码（当用户类型为2 小孩时，该项必输）
     */
    private String userParentMobile;

    /**
     * 诊疗卡类型
     * 1：健康卡
     * 2：市民卡
     * 3：医保卡
     */
    private Integer userJKKType;

    /**
     * 诊疗卡号码
     */
    private String userJKK;

    /**
     * 操作员工号
     */
    private String oprId;
}
