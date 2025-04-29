package io.github.meta39.gzsjktapi.dto.zy.subdto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public final class BedTimeRegInfoList {
    /**
     * 床位号源日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private LocalDate bedRegDate;

    /**
     * 床位号源日期对应的星期
     */
    private String bedRegWeekDay;

    /**
     * 床位号源日期对应的星期
     */
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<TimeRegInfo3> bedTimeRegInfo;
}
