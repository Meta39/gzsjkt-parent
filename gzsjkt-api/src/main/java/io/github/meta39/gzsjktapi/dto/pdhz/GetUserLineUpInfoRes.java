package io.github.meta39.gzsjktapi.dto.pdhz;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.github.meta39.gzsjktapi.dto.Res;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.time.LocalDateTime;

/**
 * 用户排队信息查询接口
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@JacksonXmlRootElement(localName = "res")
public final class GetUserLineUpInfoRes extends Res {
    /**
     * 医院ID
     */
    @JacksonXmlProperty(localName = "HOS_ID")
    private String hosId;

    /**
     * 医院ID
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
     * 用户证件类型
     */
    @JacksonXmlProperty(localName = "PATIENT_IDCARD_TYPE")
    private String patientIdcardType;

    /**
     * 用户证件号码
     */
    @JacksonXmlProperty(localName = "PATIENT_IDCARD_NO")
    private String patientIdcardNo;

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
     * 大概剩余排队时间:单位分钟
     */
    @JacksonXmlProperty(localName = "LINEUP_TIME")
    private String lineupTime;

    /**
     * 地址
     */
    @JacksonXmlProperty(localName = "LINEUP_ADDRESS")
    private String lineupAddress;

    /**
     * 备注
     */
    @JacksonXmlProperty(localName = "REMARK")
    private String remark;
}
