package io.github.meta39.gzsjktapi.dto.ybydzf;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.github.meta39.gzsjktapi.dto.Res;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 获取患者挂号费及诊金接口
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@JacksonXmlRootElement(localName = "res")
public final class GetRegFeeInfoRes extends Res {
    /**
     * 挂号费(单位“分”)
     */
    private Long regFee;

    /**
     * 诊疗费(单位“分”)
     */
    private Long treatFee;
}
