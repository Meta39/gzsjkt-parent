package io.github.meta39.gzsjktapi.dto.zy.subdto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import lombok.Data;

import java.util.List;

@Data
public final class BedRegInfo {
    /**
     * 科室ID
     */
    private String deptId;

    /**
     * 科室名称
     */
    private String deptName;

    /**
     * 床位ID号
     */
    private String bedId;

    /**
     * 床位号源日期集合
     */
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<BedTimeRegInfoList> bedTimeRegInfoList;
}
