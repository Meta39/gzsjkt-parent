package io.github.meta39.gzsjktapi.dto.yygh;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.github.meta39.gzsjktapi.dto.Res;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.time.LocalDateTime;

/**
 * 取号(订单)查询
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@JacksonXmlRootElement(localName = "res")
public final class GetInfoOrderRes extends Res {
    /**
     * 是否已取号：（当返回状态编码为0 时，该字段必输）
     * 0：未取号
     * 1：已取号
     * 2：已退费
     * 3：未付费取消
     * 4：取号未付费（专用后付费业务）
     */
    private String isTakeNum;

    /**
     * 就诊顺序号或者时间(如果已取号，该字段必输)
     */
    private String infoSeq;

    /**
     * 取号时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @JacksonXmlProperty(localName = "InfoTime")
    private LocalDateTime infoTime;

}
