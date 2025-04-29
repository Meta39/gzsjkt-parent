package io.github.meta39.gzsjktdatp.yljf;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.github.meta39.gzsjktdatp.Res;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 二维码生成接口
 */
@Data
@EqualsAndHashCode(callSuper = true)
@JacksonXmlRootElement(localName = "res")
public final class SendPayInfoRes extends Res {

    /**
     * 诊疗平台订单号
     */
    private String orderId;

    /**
     * 连接地址
     */
    private String connectURL;

    /**
     * 如果is_QRCode 的值为Y 的话，该参数为必传参数
     */
    @JacksonXmlProperty(localName = "QRCodeByBase64")
    private String qrCodeByBase64;
    
}
