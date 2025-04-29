package io.github.meta39.gzsjktapi.dto.yljf;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.github.meta39.gzsjktapi.dto.Res;
import io.github.meta39.gzsjktapi.dto.yljf.subdto.PayListInfo2;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.List;

/**
 * 已缴费记录查询接口
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@JacksonXmlRootElement(localName = "res")
public final class GetCompletedPayInfoRes extends Res {
    /**
     * 用户姓名
     */
    private String userName;

    /**
     * 就诊纪录信息的集合
     */
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<PayListInfo2> payListInfo;
}
