package io.github.meta39.gzsjktapi.dto.yygh.subdto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public final class TimeRegInfo2 {
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
     * 出诊状态
     * 0-停诊
     * 1-出诊
     * 2-暂未开放
     */
    private Integer regStatus;

    /**
     * 可预约号源数
     */
    private Integer regTotalCount;

    /**
     * 剩余号源数
     */
    private Integer regLeaveCount;

    /**
     * 用于记录医院对该号源类型或识别ID的标示
     * 作用于医保挂号费预结算类型功能（如医院没分时号源，该字段为必须项）
     */
    private String regId;

    /**
     * 1-普通号源（预约系统所有渠道通用）
     * 2：家庭医生号源（如需把号源提供至分级诊疗平台，该字段必传）
     */
    @JacksonXmlProperty(localName = "SourceNumberType")
    private Integer sourceNumberType;

    /**
     * 分时价格诊查费(单位“分”)
     */
    private Long treatFee;

}
