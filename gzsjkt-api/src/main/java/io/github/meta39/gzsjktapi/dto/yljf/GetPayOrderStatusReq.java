package io.github.meta39.gzsjktapi.dto.yljf;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

/**
 * 用户缴费状态记录查询接口（该接口视医院情况而定）
 */
@Data
@JacksonXmlRootElement(localName = "req")
public final class GetPayOrderStatusReq {
    /**
     * 医院代码
     */
    private String hospitalId;

    /**
     * HIS 就诊登记号HIS 系统中就诊登记号（内部ID），要求唯一。如：12345
     */
    private String orderId;

}
