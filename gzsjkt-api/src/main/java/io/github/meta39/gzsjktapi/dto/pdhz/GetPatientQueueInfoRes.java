package io.github.meta39.gzsjktapi.dto.pdhz;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.github.meta39.gzsjktapi.dto.Res;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.time.LocalDate;

/**
 * 用户排队信息实时查询
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@JacksonXmlRootElement(localName = "res")
public final class GetPatientQueueInfoRes extends Res {
    /**
     * 挂号日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @JacksonXmlProperty(localName = "RegisterDate")
    private LocalDate registerDate;

    /**
     * 挂号时段名称
     * 1 上午
     * 2 下午
     * 3 晚上
     */
    @JacksonXmlProperty(localName = "TimeName")
    private Integer timeName;

    /**
     * 挂号科室id
     */
    @JacksonXmlProperty(localName = "DeptId")
    private String deptId;

    /**
     * 挂号科室名称
     */
    @JacksonXmlProperty(localName = "DeptName")
    private String deptName;

    /**
     * 挂号医生姓名
     */
    @JacksonXmlProperty(localName = "DoctorName")
    private String doctorName;

    /**
     * 患者姓名
     */
    @JacksonXmlProperty(localName = "PatientName")
    private String patientName;

    /**
     * 医生叫号标志：
     * 0-未叫号
     * 1-已叫号
     */
    @JacksonXmlProperty(localName = "CallFlag")
    private Integer callFlag;

    /**
     * 就诊序号
     */
    @JacksonXmlProperty(localName = "SeqNum")
    private String seqNum;

    /**
     * 当前叫号
     */
    @JacksonXmlProperty(localName = "CallNum")
    private String callNum;

    /**
     * 队列id(医⽣/诊室/其他队列)（云陪诊接入必填）
     */
    private String queueId;

    /**
     * 队列名称(医⽣/诊室/其他队列)（云陪诊接入必填）
     */
    private String queueName;

    /**
     * 排在前面的候诊人数 - 1
     */
    @JacksonXmlProperty(localName = "WaitingNum")
    private String waitingNum;

    /**
     * 就诊地址
     */
    private String regAddress;

    /**
     * 大概剩余排队时间:单位分钟
     */
    @JacksonXmlProperty(localName = "WaitTime")
    private String waitTime;


}
