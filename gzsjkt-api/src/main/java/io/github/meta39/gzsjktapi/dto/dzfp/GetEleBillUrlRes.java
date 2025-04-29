package io.github.meta39.gzsjktapi.dto.dzfp;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.github.meta39.gzsjktapi.dto.Res;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 查看电子据票接口
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@JacksonXmlRootElement(localName = "res")
public final class GetEleBillUrlRes extends Res {

    /**
     * 电子票据 URL 地址
     */
    private String pictureUrl;
}
