package io.github.meta39.gzsjktapi.dto.yygh.subdto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public final class TimeRegInfoList {
    /**
     * 出诊日期
     * 格式：yyyy-MM-dd
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private LocalDate regDate;

    /**
     * 出诊日期对应的星期
     */
    private String regWeekDay;

    /**
     * 上午、下午、晚上的号源信息集合
     */
    private List<TimeRegInfo> timeRegInfo;
}
