package io.github.meta39.gzsjktapi.dto.yygh;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.github.meta39.gzsjktapi.dto.Res;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 用户就诊卡查询接口
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@JacksonXmlRootElement(localName = "res")
public final class MedicalCardQueryRes extends Res {
    /**
     * 有效就诊卡
     */
    private String medicalCard;

    /**
     * 卡类型
     * 0-医院内部诊疗卡（可以是虚拟卡号，非临时卡）
     * 7- 健康卡
     * 8- 市民卡
     * 9- 社保卡
     * 10- 银行卡
     * 11- 公费医疗卡
     * 12- 农合证
     * 99- 其他卡
     */
    private Integer cardType;

}
