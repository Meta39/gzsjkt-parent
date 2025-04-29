package io.github.meta39.gzsjktapi.dto.zy;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.github.meta39.gzsjktapi.dto.Res;
import io.github.meta39.gzsjktapi.dto.zy.subdto.BedRegInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.List;

/**
 * 床位号源信息查询接口
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@JacksonXmlRootElement(localName = "res")
public final class GetBedRegInfoRes extends Res {
    /**
     * 床位号源信息的集合
     * 当数据为空时不返回本节点
     */
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<BedRegInfo> bedRegInfo;

}
