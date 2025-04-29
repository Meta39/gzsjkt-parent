package io.github.meta39.gzsjktapi.dto.zy.subdto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public final class TimeRegInfo3 {
    /**
     * 时段
     * 1:上午
     * 2:下午
     * 3:晚上
     */
    private Integer timeFlag;

    /**
     * 出诊状态
     * 1- 开放预约
     * 2- 暂未开放
     */
    private Integer bedRegStatus;

    /**
     * 该时段可预约的总号源数
     */
    private Integer bedRegTotalCount;

    /**
     * 该时段剩余号源数
     */
    private Integer bedRegleaveCount;

    /**
     * 床位押金
     */
    private Long bedRegFee;

    /**
     * 用于区别于普通号源和特殊号源：
     * 2- 家庭医生号源
     */
    @JacksonXmlProperty(localName = "SourceNumberType")
    private Integer sourceNumberType;
}
