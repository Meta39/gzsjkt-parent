package io.github.meta39.gzsjktapi.dto.yljf.subdto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import lombok.Data;

import java.util.List;

@Data
public final class PresList {
    /**
     * 处方ID
     */
    private String prescriptionId;

    /**
     * 药品/检验明细集合
     */
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<MedicinalList> medicinalList;
}
