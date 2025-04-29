package io.github.meta39.gzsjktapi.dto.yygh;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.github.meta39.gzsjktapi.dto.Res;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 取号接口（用于自助终端）
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@JacksonXmlRootElement(localName = "res")
public final class InfoOrderRes extends Res {
    /**
     * 就诊顺序号或者时间
     */
    private String infoSeq;

    /**
     * 挂号凭条医院个性化打印内容
     */
    private String print;

}
