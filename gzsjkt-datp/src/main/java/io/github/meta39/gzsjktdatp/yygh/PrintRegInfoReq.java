package io.github.meta39.gzsjktdatp.yygh;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * 取号/报到接口（返回Res）
 */
@Data
@JacksonXmlRootElement(localName = "req")
public class PrintRegInfoReq {
    /**
     * 医院代码
     */
    private String hospitalId;

    /**
     * 诊疗平台的订单号
     */
    private String orderId;

    /**
     * 就诊顺序号
     */
    private String infoSeq;

    /**
     * 推送状态
     * 0:取号
     * 1:报到
     */
    private Integer pushStatus;

    /**
     * 停诊开始日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @JacksonXmlProperty(localName = "InfoTime")
    private LocalDateTime infoTime;


}
