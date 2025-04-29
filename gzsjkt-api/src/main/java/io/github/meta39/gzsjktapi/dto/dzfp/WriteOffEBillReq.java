package io.github.meta39.gzsjktapi.dto.dzfp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * 电子票据冲红接口（接口实现返回对象填Void）
 */
@Data
@JacksonXmlRootElement(localName = "req")
public final class WriteOffEBillReq {
    /**
     * 电子票据代码
     */
    private String billBatchCode;

    /**
     * 电子票据号码
     */
    private String billNo;

    /**
     * 冲红原因
     */
    private String reason;

    /**
     * 经办人
     */
    private String operator;

    /**
     * 业务发生时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime busDateTime;

    /**
     * 开票点编码
     */
    private String placeCode;

}
