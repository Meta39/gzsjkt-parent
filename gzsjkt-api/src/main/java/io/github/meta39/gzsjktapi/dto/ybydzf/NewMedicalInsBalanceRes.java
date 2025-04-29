package io.github.meta39.gzsjktapi.dto.ybydzf;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.github.meta39.gzsjktapi.dto.Res;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.time.LocalDateTime;

/**
 * 腾讯医保-医院预结算接口
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@JacksonXmlRootElement(localName = "res")
public final class NewMedicalInsBalanceRes extends Res {
    /**
     * 统筹订单号
     */
    private String overAllOrder;

    /**
     * 总共需要支付现金金额单位为分>0 表示订单总额即全额现金的价格。
     * 由于医保局支付有优惠，全额现金的价格可能会大于 cash_fee + insurance_fee 的和，不一定等于 cash_fee + insurance_fee
     */
    @JacksonXmlProperty(localName = "total_fee")
    private Long totalFee;

    /**
     * 预结算-统筹金额不需要或者不能预结算订单传0
     * 线上预结算模式填总金额线下预结算模式填实际医保金额
     */
    @JacksonXmlProperty(localName = "insurance_fee")
    private Long insuranceFee;

    /**
     * 现金需要支付的金额单位为分>=0 线上预结算模式金额填0线下预结算模式填实际自费金额
     */
    @JacksonXmlProperty(localName = "cash_fee")
    private Long cashFee;

    /**
     * 由医疗机构额外增加的现金金额单位为分，默认0 用于医院在医保预结算之外增加现金扣费，举例:
     * 原需要支付的是: total_ fee 200cash_ fee 100
     * insurance fee 100。现新增现金50，则入参为:
     * total_ _fee 250 ( 总额加上额外现金)
     * cash fee 150(自费加上额外现金) cash_add_fee 50 (额外现金)
     * insurance_ fee 100
     */
    @JacksonXmlProperty(localName = "cash_add_fee")
    private Long cashAddFee;

    /**
     * 解释：由医院减免的现金优惠金额用于医院优惠活动，举例：原需要支付的是：total_fee 200
     * cash_fee 100
     * insurance_fee 100。现优惠现金50，则入参为：total_fee 200
     * cash_fee 50
     * cash_reduced_fee 50
     * insurance_fee 100
     */
    @JacksonXmlProperty(localName = "cash_reduced_fee")
    private Long cashReducedFee;

    /**
     * 解释：减免金额文案备注：减免金额的文案类型，1 为：预交金支付不填则为默认的“机构优惠金额”
     */
    @JacksonXmlProperty(localName = "cash_reduced_wording")
    private String cashReducedWording;

    /**
     * 0：不允许
     * 1：允许当医保局返回的预结算金额与医院上传的金额不一致时，此字段为0 则直接报错，为1 则以医保局金额为准
     */
    @JacksonXmlProperty(localName = "allow_fee_change")
    private Integer allowFeeChange;

    /**
     * 医保局局提供的医疗机构编码
     */
    @JacksonXmlProperty(localName = "org_no")
    private String orgNo;

    /**
     * 下单时间（特殊格式：yyyyMMddHHmmss）
     */
    @JsonFormat(pattern = "yyyyMMddHHmmss", timezone = "GMT+8")
    @JacksonXmlProperty(localName = "gmt_out_create")
    private LocalDateTime gmtOutCreate;

    /**
     * 市医保：医院HIS系统订单号
     * 市直/省直：对应医保系统的bka025
     */
    @JacksonXmlProperty(localName = "serial_no")
    private String serialNo;

    /**
     * 啊
     */
    @JacksonXmlProperty(localName = "bill_no")
    private String billNo;

    /**
     * 医疗机构透传医保
     */
    @JacksonXmlProperty(localName = "request_content")
    private String requestContent;
}
