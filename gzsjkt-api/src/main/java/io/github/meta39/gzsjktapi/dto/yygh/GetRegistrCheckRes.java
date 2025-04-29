package io.github.meta39.gzsjktapi.dto.yygh;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.github.meta39.gzsjktapi.dto.Res;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 就诊报到接口
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@JacksonXmlRootElement(localName = "res")
public final class GetRegistrCheckRes extends Res {
    /**
     * 就诊顺序号或流水号（已报到状态该字段为必传）对应挂号接口 orderIdHIS 字段
     */
    private String infoSeq;

    /**
     * 候诊指引举例说明：请到1 号楼3 楼A 区诊室10 候诊
     */
    private String regAddress;

    /**
     * 医院候诊提醒该字段非必传，适医院情况而定
     */
    private String regRubric;

}
