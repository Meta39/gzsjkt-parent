package io.github.meta39.gzsjktapi.dto.yygh.subdto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public final class TimeRegInfo {
    /**
     * 时段
     * 1:上午
     * 4：中午
     * 2:下午
     * 3:晚上
     */
    private Integer timeFlag;

    /**
     * 出诊状态
     * 0-停诊
     * 1-出诊
     * 2-暂未开放
     */
    private Integer regStatus;

    /**
     * 该时段可预约的总号源数
     */
    private Integer regTotalCount;

    /**
     * 该时段剩余号源数
     */
    private Integer regleaveCount;

    /**
     * 挂号费(单位“分”):
     * 挂号费按政策为‘0’可不传
     */
    private Long regFee;

    /**
     * 诊查费(单位“分”)
     */
    private Long treatFee;

    /**
     * 挂号费(单位“分”) :
     * 挂号费按政策为‘0’可不传
     */
    private Long babyRegFee;

    /**
     * 诊查费(单位“分”)
     */
    private Long babyTreatFee;

    /**
     * 是否有分时
     * 0- 否
     * 1- 是
     */
    private Integer isTimeReg;

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

}
