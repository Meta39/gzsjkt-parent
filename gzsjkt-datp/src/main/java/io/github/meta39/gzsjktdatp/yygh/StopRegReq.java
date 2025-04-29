package io.github.meta39.gzsjktdatp.yygh;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

import java.time.LocalDate;

/**
 * 停诊通知接口（返回Res）
 */
@Data
@JacksonXmlRootElement(localName = "req")
public class StopRegReq {
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
     * 排班编号：与[云陪诊挂号记录]数据集中的 scheduleNum 排班编号关联。
     */
    private String scheduleNum;

    /**
     * 停诊开始日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private LocalDate beginDate;

    /**
     * 停诊结束日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private LocalDate endDate;

    /**
     * 时段
     * 1:上午
     * 2:下午
     * 3:晚上
     * 4:全部
     */
    private Integer timeFlag;

    /**
     * 停诊开始时间(HH:mm)
     */
    private String beginTime;

    /**
     * 停诊结束时间(HH:mm)
     */
    private String endTime;

    /**
     * 停诊原因
     */
    private String reason;

}
