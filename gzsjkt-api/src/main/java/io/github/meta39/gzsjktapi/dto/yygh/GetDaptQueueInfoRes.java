package io.github.meta39.gzsjktapi.dto.yygh;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.github.meta39.gzsjktapi.dto.Res;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 科室候诊信息实时查询
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@JacksonXmlRootElement(localName = "res")
public final class GetDaptQueueInfoRes extends Res {
    /**
     * 科室联系电话
     */
    private String deptTel;

    /**
     * 科室实时候诊人数
     */
    private Integer waitingNum;

    /**
     * 该科室详细就诊指引（告知用户如何去往该科室就诊）
     */
    private String regAddress;

    /**
     * 线下挂号号源数量（线下该科室可挂号的号源数量）
     */
    private Integer deptReglevCount;

    /**
     * 大概剩余排队时间:单位分钟（预留字段可以传空）
     */
    private Integer waitTime;

    /**
     * 预留字段可以传空
     */
    private String reserve;

}
