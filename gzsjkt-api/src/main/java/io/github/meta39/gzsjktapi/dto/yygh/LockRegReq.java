package io.github.meta39.gzsjktapi.dto.yygh;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

import java.time.LocalDate;

/**
 * 号源锁定（接口实现返回对象填Void）
 */
@Data
@JacksonXmlRootElement(localName = "req")
public final class LockRegReq {
    /**
     * 号源锁定ID（诊疗平台产生）
     */
    private String lockId;

    /**
     * 医院代码
     */
    private String hospitalId;

    /**
     * 科室代码
     */
    @JacksonXmlProperty(localName = "DeptId")
    private String deptId;

    /**
     * 医生代码
     */
    private String doctorId;

    /**
     * 出诊日期
     * 格式：yyyy-MM-dd
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private LocalDate regDate;

    /**
     * 时段
     * 1:上午
     * 4:中午
     * 2:下午
     * 3:晚上
     */
    private Integer timeFlag;

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
     * 挂号费(单位“分”)
     */
    private Long regFee;

    /**
     * 诊查费(单位“分”)
     */
    private Long treatFee;
}
