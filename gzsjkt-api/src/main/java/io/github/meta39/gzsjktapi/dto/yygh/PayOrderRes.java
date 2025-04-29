package io.github.meta39.gzsjktapi.dto.yygh;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.github.meta39.gzsjktapi.dto.Res;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 挂号支付
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@JacksonXmlRootElement(localName = "res")
public final class PayOrderRes extends Res {
    /**
     * 就诊地址
     */
    private String doctorAddress;

    /**
     * 就诊顺序号
     */
    @JacksonXmlProperty(localName = "InfoSeq")
    private String infoSeq;

    /**
     * 预约开始时间：HH:mm
     * （无号源分时的医院支付完成需要返回分诊时间时，该字段有效）
     */
    private String startTime;

    /**
     * 预约结束时间：HH:mm
     * （无号源分时的医院支付完成需要返回分诊时间时，该字段有效）
     */
    private String endTime;

    /**
     * HIS 确定的就诊卡,his
     * 内部就诊卡号（社保卡，健康卡，医院诊疗卡）
     */
    private String medicalCard;

    /**
     * 卡类型
     * 0-医院内部诊疗卡（可以是虚拟卡号，非临时卡）
     * 1- 健康卡
     * 2- 市民卡
     * 3- 社保卡
     * 4- 银行卡
     * 5- 公费医疗卡
     * 6- 农合证
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
