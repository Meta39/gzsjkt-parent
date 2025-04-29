package io.github.meta39.gzsjktapi.dto.dzfp;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

/**
 * 查看电子据票接口
 */
@Data
@JacksonXmlRootElement(localName = "req")
public final class GetEleBillUrlReq {
    /**
     * 电子票据代码
     */
    private String billBatchCode;

    /**
     * 电子票据号码
     */
    private String billNo;

    /**
     * 电子校验码
     */
    private String random;

}
