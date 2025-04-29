package io.github.meta39.gzsjktapi.dto.yygh;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.github.meta39.gzsjktapi.dto.Res;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 退费接口
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@JacksonXmlRootElement(localName = "res")
public final class ReturnPayRes extends Res {
    /**
     * 透传医保局（医保退款）
     */
    private String requestContent;

    /**
     * 撤销流水号医保退款必填，医保局无要求则由医院自定义
     */
    private String cancelSerialNo;

    /**
     * 医院退费订单号（医保退款）
     */
    private String hisOrderId;

}
