package io.github.meta39.gzsjktapi.dto.yjfw;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.github.meta39.gzsjktapi.dto.Res;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 医技服务部分支付接口
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@JacksonXmlRootElement(localName = "res")
public final class GetServerOrderRes extends Res {
    /**
     * 有效就诊卡（开具电子发票以下字段为必传）
     */
    private String billIdHis;

    /**
     * 电子发票医院ID（开具电子发票以下字段为必传）
     */
    private String hospitalId;

    /**
     * 电子发票开票点编码（开具电子发票以下字段为必传）
     */
    private String placeCode;

    /**
     * 电子发票开具类型（开具电子发票以下字段为必传）
     */
    private String busType;

    /**
     * 电子发票经办人（开具电子发票以下字段为必传）
     */
    private String operator;

}
