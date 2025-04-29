package io.github.meta39.gzsjktapi.dto.zljg;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

/**
 * 获取医疗结果查询接口
 */
@Data
@JacksonXmlRootElement(localName = "req")
public final class GetMedicalResultsReq {
    /**
     * 医院代码
     */
    private String hospitalId;

    /**
     * 诊疗平台订单号
     */
    private String orderId;

}
