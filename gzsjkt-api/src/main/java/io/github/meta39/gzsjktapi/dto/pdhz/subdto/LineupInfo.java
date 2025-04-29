package io.github.meta39.gzsjktapi.dto.pdhz.subdto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

import java.time.LocalDate;

@Data
public final class LineupInfo {

    /**
     * 院内排队ID
     */
    @JacksonXmlProperty(localName = "LINEUP_ID")
    private String lineupId;

    /**
     * 项目类别
     */
    @JacksonXmlProperty(localName = "ITEM_TYPE")
    private String itemType;

    /**
     * 项目名称
     */
    @JacksonXmlProperty(localName = "ITEM_NAME")
    private String itemName;

    /**
     * 当前排队序号（前面还有多少人排队）
     */
    @JacksonXmlProperty(localName = "LINEUP_NO")
    private String lineupNo;

    /**
     * 剩余排队时间：单位分钟
     */
    @JacksonXmlProperty(localName = "LINEUP_TIME")
    private String lineupTime;

    /**
     * 地址
     */
    @JacksonXmlProperty(localName = "LINEUP_ADDRESS")
    private String lineupAddress;

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
     * 备注
     */
    @JacksonXmlProperty(localName = "REMARK")
    private String remark;

}
