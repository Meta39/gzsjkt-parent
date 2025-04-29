package io.github.meta39.gzsjktapi.dto.pdhz;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.github.meta39.gzsjktapi.dto.Res;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 用户绑定接口
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@JacksonXmlRootElement(localName = "res")
public final class BindUserRes extends Res {
    /**
     * 用户院内ID
     */
    @JacksonXmlProperty(localName = "HOSP_PATIENT_ID")
    private String hospPatientId;

}
