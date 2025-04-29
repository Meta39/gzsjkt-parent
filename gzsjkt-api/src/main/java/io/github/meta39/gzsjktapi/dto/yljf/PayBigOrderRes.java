package io.github.meta39.gzsjktapi.dto.yljf;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.github.meta39.gzsjktapi.dto.Res;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 待缴费记录支付接口
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@JacksonXmlRootElement(localName = "res")
public final class PayBigOrderRes extends Res {
    /**
     * HIS 缴费订单号缴费成功时返回HIS系统生成的缴费订单，要求唯一。
     */
    private String orderIdHIS;

    /**
     * 订单相关信息描述（可含医院个性信息，如取药窗）
     */
    private String orderDesc;

    /**
     * 待打印信息(自助机用的)
     */
    private String printMsg;

    /**
     * 收据ID
     */
    private String receiptID;

    /**
     * HIS 确定的就诊卡,his 内部就诊卡号（社保卡，健康卡，医院诊疗卡）
     */
    private String medicalCard;

    /**
     * 卡类型
     * 0-医院内部诊疗卡（可以是虚拟卡号，非临时卡）
     * 13- 健康卡
     * 14- 市民卡
     * 15- 社保卡
     * 16- 银行卡
     * 17- 公费医疗卡
     * 18- 农合证
     * 99- 其他卡
     */
    private Integer cardType;

    /**
     * 电子票据收费单ID（唯一标识）
     */
    private String billIdHis;

    /**
     * 电子发票医院ID
     */
    private String hospitalId;

    /**
     * 电子发票开票点编码
     */
    private String placeCode;

    /**
     * 电子发票开具类型
     */
    private String busType;

    /**
     * 电子发票经办人
     */
    private String operator;

}
