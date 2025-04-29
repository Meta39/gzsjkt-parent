package io.github.meta39.gzsjktapi.dto.yygh;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.github.meta39.gzsjktapi.dto.Res;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 挂号接口(用于电话预约)
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@JacksonXmlRootElement(localName = "res")
public final class AddOrderByLockRes extends Res {
    /**
     * 当resultCode=0 时，不可为空，存放HIS 系统生成的订单号。
     */
    private String orderIdHIS;

    /**
     * 用户标志（HIS 需要根据订单中的用户信息如身份证件号码判断是否在HIS 里存在的标志，在取号环节，如果该字段是0，则预约系统提示用户去挂号窗口登记注册）
     * 0- 初次就诊患者
     * 1- 复诊患者
     */
    private Integer userFlag;

}
