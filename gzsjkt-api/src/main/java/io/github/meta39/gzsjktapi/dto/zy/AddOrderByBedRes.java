package io.github.meta39.gzsjktapi.dto.zy;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.github.meta39.gzsjktapi.dto.Res;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 床位预约接口
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@JacksonXmlRootElement(localName = "res")
public final class AddOrderByBedRes extends Res {
    /**
     * 当 resultCode=0 时，不可为空，存放 HIS 系统生成的订单号。
     */
    private String orderIdHIS;

}
