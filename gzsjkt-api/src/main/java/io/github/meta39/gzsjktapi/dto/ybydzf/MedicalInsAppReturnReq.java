package io.github.meta39.gzsjktapi.dto.ybydzf;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

/**
 * 取消结算通知接口（接口实现返回对象填Void）
 */
@Data
@JacksonXmlRootElement(localName = "req")
public final class MedicalInsAppReturnReq {
    /**
     * 医院代码
     */
    private String hospitalId;

    /**
     * 统筹订单号
     */
    private String overAllOrder;

}
