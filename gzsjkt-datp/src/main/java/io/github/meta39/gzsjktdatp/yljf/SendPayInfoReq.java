package io.github.meta39.gzsjktdatp.yljf;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

import java.time.LocalDate;

/**
 * 二维码生成接口
 */
@Data
@JacksonXmlRootElement(localName = "req")
public final class SendPayInfoReq {

    /**
     * 医院代码
     */
    private String hospitalId;

    /**
     * 科室名称
     */
    private String deptName;

    /**
     * 医生名称
     */
    private String doctorName;

    /**
     * HIS 系统中订单号，要求唯一。如：12345
     */
    private String orderIdHIS;

    /**
     * 用户身份证
     */
    private String identityCard;

    /**
     * 身份证类型：
     * 1----中国身份证
     * 2----香港身份证
     * 3----台湾身份证
     */
    private Integer identityType;

    /**
     * 姓名
     */
    private String userName;

    /**
     * 电话
     */
    private String mobile;

    /**
     * 创建日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private LocalDate createDate;

    /**
     * 处方显示总费用,该字段用于与getPayDetailInfo4QRCode 接口的totalAmout 比对，判断该订单在医院线下是否有修改过，单位:分
     */
    private Long totalAmout;

    /**
     * 是否需要提供二维码BASE64 字符开关：
     * 1.Y（开）
     * 2.N（关）
     * --建议医院根据连接地址自己生成二维码，因BASE64 数据传输比较大，较为容易出现数据传输超时。
     */
    @JacksonXmlProperty(localName = "is_QRCode")
    private String isQrCode;

    /**
     * 就诊卡（视医院而定，如果医院传了，会在payBigOrder 传过去给医院）
     */
    private String medicalCard;

}
