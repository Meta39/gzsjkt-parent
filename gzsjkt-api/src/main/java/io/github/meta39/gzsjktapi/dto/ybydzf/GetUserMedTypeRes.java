package io.github.meta39.gzsjktapi.dto.ybydzf;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.github.meta39.gzsjktapi.dto.Res;
import io.github.meta39.gzsjktapi.dto.ybydzf.subdto.MedTypeList;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.List;

/**
 * 用户医保类型身份查询
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@JacksonXmlRootElement(localName = "res")
public final class GetUserMedTypeRes extends Res {
    /**
     * 医院返回患者医保类型集合
     */
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<MedTypeList> medTypeList;

}
