package io.github.meta39.gzsjktapi.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * 私有无参构造函数，不允许直接new！
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
@JacksonXmlRootElement(localName = "res")
public class Res {
    private static final Integer code = 0;
    private static final String msg = "success";

    /**
     * 不让子类使用set方法
     * 响应的根元素 <res> 添加 service="beanName" 属性
     */
    @JacksonXmlProperty(isAttribute = true)
    private String service;

    /**
     * 不让子类使用set方法
     * 返回状态编码：0-成功
     */
    private Integer resultCode = code;

    /**
     * 不让子类使用set方法
     * 返回状态描述
     */
    private String resultDesc = msg;

    /**
     * GzsjktController 自动填充service
     */
    public Res(String service) {
        this.service = service;
    }

    /**
     * GzsjktController自动填充service，不用手动set！！！
     */
    public void changeService(String service) {
        this.service = service;
    }

}
