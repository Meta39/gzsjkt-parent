package io.github.meta39.gzsjktapi.dto.ybydzf;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.github.meta39.gzsjktapi.dto.ybydzf.subdto.OrderDetailInfo4;
import lombok.Data;

import java.util.List;

/**
 * 医保个账金额查询（预结算/统筹结算）
 */
@Data
@JacksonXmlRootElement(localName = "req")
public final class MedicalInsAppBalanceReq {
    /**
     * 医院代码
     */
    private String hospitalId;

    /**
     * 0-预结算接口
     * 1- 统筹结算接口
     */
    private Integer medInsFaceType;

    /**
     * HIS 系统中就诊登记号（内部ID），要求唯一。如：12345
     */
    private String infoSeq;

    /**
     * 缴费订单流水号集合
     */
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<OrderDetailInfo4> orderDetailInfo;

}
