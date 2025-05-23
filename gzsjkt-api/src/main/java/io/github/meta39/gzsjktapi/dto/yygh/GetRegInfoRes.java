package io.github.meta39.gzsjktapi.dto.yygh;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.github.meta39.gzsjktapi.dto.Res;
import io.github.meta39.gzsjktapi.dto.yygh.subdto.RegInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.List;

/**
 * 医生号源信息查询
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@JacksonXmlRootElement(localName = "res")
public final class GetRegInfoRes extends Res {
    /**
     * 医生号源信息的集合
     * 当数据为空时不返回本节点
     */
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<RegInfo> regInfo;
}
