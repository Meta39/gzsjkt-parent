package io.github.meta39.gzsjktdatp.dzfp;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

/**
 * 发票状态推送接口（返回Res）
 */
@Data
@JacksonXmlRootElement(localName = "req")
public final class PushBillReq {

    /**
     * 收费单ID（唯一标识）
     */
    private String chgnoteId;

    /**
     * 推送类型：
     * 0-开票
     * 1-冲红
     */
    private Integer pushType;

    /**
     * 发票状态
     * 0-已开票/已冲红
     */
    private Integer invoicState;

    /**
     * 电子票据URL 地址
     */
    private String pictureUrl;

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
