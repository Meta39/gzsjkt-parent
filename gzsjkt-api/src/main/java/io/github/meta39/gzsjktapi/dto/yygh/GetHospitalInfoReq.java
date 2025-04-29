package io.github.meta39.gzsjktapi.dto.yygh;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

/**
 * 医院信息查询
 */
@Data
@JacksonXmlRootElement(localName = "req")
public final class GetHospitalInfoReq {
    /**
     * 医院ID
     */
    private String hospitalId;
}
