package io.github.meta39.gzsjktapi.dto.dzfp;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.github.meta39.gzsjktapi.dto.Res;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 电子票据开具接口
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@JacksonXmlRootElement(localName = "res")
public final class InvoicingInfoRes extends Res {
    /**
     * 电子票据代码(状态为已开票时不可为空)
     */
    private String billBatchCode;

    /**
     * 电子票据号码(状态为已开票时不可为空)
     */
    private String billNo;

    /**
     * 电子校验码(状态为已开票时不可为空)
     */
    private String random;

    /**
     * 电子票据 URL 地址(状态为已开票时不可为空)
     */
    private String pictureUrl;
}
