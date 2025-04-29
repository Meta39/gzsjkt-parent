package io.github.meta39.gzsjktapi.dto.dzfp;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

/**
 * 电子票据开具接口
 */
@Data
@JacksonXmlRootElement(localName = "req")
public final class InvoicingInfoReq {
    /**
     * 医院代码
     */
    private String hospitalId;

    /**
     * 经办人
     */
    private String operator;

    /**
     * 开票点编码
     */
    private String placeCode;

    /**
     * 收费单ID
     */
    private String chgnoteId;

    /**
     * 开具类型编码：
     * 01 预约挂号
     * 02 医疗缴费
     * 03 互联网 + 护理预约
     */
    private String busType;

}
