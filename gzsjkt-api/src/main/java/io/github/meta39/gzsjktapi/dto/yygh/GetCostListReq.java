package io.github.meta39.gzsjktapi.dto.yygh;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

/**
 * 费用清单查询
 */
@Data
@JacksonXmlRootElement(localName = "req")
public final class GetCostListReq {
    /**
     * 医院代码
     */
    private String hospitalId;

    /**
     * 诊疗平台订单号
     */
    private String orderId;

    /**
     * 医院挂号流水号
     */
    private String orderIdHIS;

    /**
     * 缴费单编码，关联订单待⽀付事件。
     * 字段为空时，返回当前号源全部缴费单信息。同就诊事件信息上传的⼀样
     */
    private String payId;

    /**
     * 院内就诊卡号，关联费⽤清单数据集，同就诊事件信息上传的⼀样
     */
    private String infoCard;

    /**
     * 院内就诊卡类型，关联费⽤清单数据集，具体以医疗医院实际卡类型为准。同就诊事件信息上传的⼀样
     */
    private String infoCardType;

}
