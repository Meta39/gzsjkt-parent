package io.github.meta39.gzsjktapi.dto.pdhz;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.github.meta39.gzsjktapi.dto.Res;
import io.github.meta39.gzsjktapi.dto.pdhz.subdto.PatientLineupInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.List;

/**
 * 用户排队列表查询接口
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@JacksonXmlRootElement(localName = "res")
public final class GetUserLineUpListRes extends Res {
    /**
     * 医院ID
     */
    @JacksonXmlProperty(localName = "HOS_ID")
    private String hosId;

    /**
     * 提取数据时间
     */
    @JacksonXmlProperty(localName = "DATA_TIME")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime dataTime;

    /**
     * 医院ID
     */
    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "PATIENT_LINEUP_INFO")
    private List<PatientLineupInfo> patientLineupInfo;
}
