package io.github.meta39.gzsjktapi.dto.ybydzf;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

/**
 * 获取患者挂号费及诊金接口
 */
@Data
@JacksonXmlRootElement(localName = "req")
public final class GetRegFeeInfoReq {
    /**
     * 医保类型代码，医院内部识别医保类型的code
     */
    private String medCode;

    /**
     * 用于记录医院对该号源类型的标示，作用于医保挂号费预结算类型功能
     */
    private String regId;

}
