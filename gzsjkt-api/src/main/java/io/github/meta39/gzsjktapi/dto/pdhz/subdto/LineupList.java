package io.github.meta39.gzsjktapi.dto.pdhz.subdto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

import java.util.List;

@Data
public final class LineupList {
    /**
     * 用户排队列表
     */
    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "LINEUP_INFO")
    private List<LineupInfo> lineupInfo;
}
