package io.github.meta39.gzsjktapi.dto.pdhz;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

import java.time.LocalDate;

/**
 * 用户排队信息实时查询
 */
@Data
@JacksonXmlRootElement(localName = "req")
public final class GetPatientQueueInfoReq {

    /**
     * 医院代码
     */
    private String hospitalId;

    /**
     * 挂号日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private LocalDate regDate;

    /**
     * 平台订单号（医院可选择是通过流水号或者平台订单号为查询条件二选一）
     */
    private String orderNo;

    /**
     * 医院流水号（医院可选择是通过流水号或者平台订单号为查询条件二选一）
     */
    @JacksonXmlProperty(localName = "SeqNO")
    private String seqNo;

    /**
     * 关联云陪诊门诊就诊记录中事件类型是取号事件签到事件、检查排队叫号事件、检验排队叫号事件的sjyI 字段中的queueld（云陪诊接入必填）
     */
    private String queueId;

}
