package io.github.meta39.gzsjktdatp;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Getter;

/**
 * 请求广州市健康通返回的对象
 */
@Getter
@JacksonXmlRootElement(localName = "res")
public class Res {

    /**
     * 不让子类使用set方法
     * 返回状态编码：0-成功
     */
    private Integer resultCode;

    /**
     * 不让子类使用set方法
     * 返回状态描述
     */
    private String resultDesc;

}
