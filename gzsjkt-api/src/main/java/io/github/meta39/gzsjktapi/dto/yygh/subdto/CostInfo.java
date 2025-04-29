package io.github.meta39.gzsjktapi.dto.yygh.subdto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import lombok.Data;

import java.util.List;

@Data
public final class CostInfo {
    /**
     * 费⽤⼤类名称
     */
    private String fydlmc;
    /**
     * 费⽤⼤类代码
     */
    private String fydldm;
    /**
     * 费用大类金额，本类收费项目各金额的总计，计量单位为分
     */
    private Long fydlje;
    /**
     * 费⽤⼤类名称
     */
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Fyqd> fyqd;

}
