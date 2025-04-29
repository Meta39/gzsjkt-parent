package io.github.meta39.gzsjktdatp.ts;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * 信息推送接口（返回Res）
 */
@Data
@JacksonXmlRootElement(localName = "req")
public final class PushInfoReq {

    /**
     * 医院ID
     */
    @JacksonXmlProperty(localName = "HOS_ID")
    private String hosId;

    /**
     * 提取数据时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @JacksonXmlProperty(localName = "DATA_TIME")
    private LocalDateTime dataTime;

    /**
     * 用户院内ID
     */
    @JacksonXmlProperty(localName = "HOSP_PATIENT_ID")
    private String hospPatientId;

    /**
     * 用户证件类型：
     * 01- 身份证
     * 02- 港澳来往内地通行证
     * 03- 台湾来往大陆通行证
     * 04- 护照
     */
    @JacksonXmlProperty(localName = "PATIENT_IDCARD_TYPE")
    private String patientIdcardType;

    /**
     * 用户证件号码
     */
    @JacksonXmlProperty(localName = "PATIENT_IDCARD_NO")
    private String patientIdcardNo;

    /**
     * 用户卡类型：
     * 1 健康卡
     * 2 市民卡
     * 3 社保卡
     * 4 银行卡
     * 5 公费医疗卡
     * 6 农合证
     * 7 院内诊疗卡
     * 8 就诊卡
     * 9 系统内部号
     * 99- 其他卡
     */
    @JacksonXmlProperty(localName = "PATIENT_CARD_TYPE")
    private Integer patientCardType;

    /**
     * 用户卡号
     */
    @JacksonXmlProperty(localName = "PATIENT_CARD_NO")
    private String patientCardNo;

    /**
     * 用户姓名
     */
    @JacksonXmlProperty(localName = "PATIENT_NAME")
    private String patientName;

    /**
     * 平台订单号
     */
    @JacksonXmlProperty(localName = "ORDER_ID")
    private String orderId;

    /**
     * 院内挂号或取号时产生的流水号或订单号
     */
    @JacksonXmlProperty(localName = "HOSP_ORDER_ID")
    private String hospOrderId;

    /**
     * 科室名称
     */
    @JacksonXmlProperty(localName = "DEPT_NAME")
    private String deptName;

    /**
     * 医生名称
     */
    @JacksonXmlProperty(localName = "DOCTOR_NAME")
    private String doctorName;

    /**
     * 预约时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @JacksonXmlProperty(localName = "REG_DT")
    private LocalDate regDt;

    /**
     * 推送类型：
     * 1- 缴费通知
     * 2- 排队提醒
     * 3- 检查报告提醒
     * 4- 检验报告提醒
     */
    @JacksonXmlProperty(localName = "PUSH_TYPE")
    private Integer pushType;

    /**
     * 推送信息的ID，院内唯一的排队ID、检查/检验报告ID 或缴费登记号
     */
    @JacksonXmlProperty(localName = "PUSH_ID")
    private String pushId;

    /**
     * 推送内容
     */
    @JacksonXmlProperty(localName = "PUSH_CONTENT")
    private String pushContent;

    /**
     * 报告时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @JacksonXmlProperty(localName = "REPORT_TIME")
    private LocalDateTime reportTime;

    /**
     * 检验/检查项目名称如：（肝功五项、核磁共振等）
     */
    @JacksonXmlProperty(localName = "ITEM_NAME")
    private String itemName;

    /**
     * 如果通知类型是检验的(PUSH_TYPE=4)，传回检验结果
     */
    @JacksonXmlProperty(localName = "TEST_RESULT")
    private String testResult;

    /**
     * 应缴金额
     * 格式00,00
     */
    @JacksonXmlProperty(localName = "PAY_FEE")
    private String payFee;


}
