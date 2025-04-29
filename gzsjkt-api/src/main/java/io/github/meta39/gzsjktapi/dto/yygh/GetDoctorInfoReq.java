package io.github.meta39.gzsjktapi.dto.yygh;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

/**
 * 医生信息查询
 */
@Data
@JacksonXmlRootElement(localName = "req")
public final class GetDoctorInfoReq {
    /**
     * 医院ID
     */
    private String hospitalId;

    /**
     * 科室代码
     * 如果为空则获取所有科室的信息
     */
    private String deptId;

    /**
     * 医生代码
     * 如果为空则获取某科室下所有医生的信息
     */
    private String doctorId;
}
