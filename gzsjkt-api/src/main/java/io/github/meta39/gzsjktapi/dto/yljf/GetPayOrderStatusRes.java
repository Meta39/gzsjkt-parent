package io.github.meta39.gzsjktapi.dto.yljf;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.github.meta39.gzsjktapi.dto.Res;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.time.LocalDateTime;

/**
 * 用户缴费状态记录查询接口（该接口视医院情况而定）
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@JacksonXmlRootElement(localName = "res")
public final class GetPayOrderStatusRes extends Res {
    /**
     * 当有该笔订单时，必传。
     */
    private String orderIdHIS;

    /**
     * 支付金额，单位：分
     */
    private Long payAmout;

    /**
     * 支付方式：
     * 1-网站银联
     * 2-手机银联
     * 3-羊城通
     * 4-终端银联
     * 5-12320 支付
     * 6-窗口支付
     * 7-健康卡
     * 8-数字电视金卡
     * 9-微信支付
     * 10-支付宝支付
     * 11-医保支付
     */
    private Integer payMode;

    /**
     * 交易时间（特殊格式：yyyyMMddHHmmss）
     */
    @JsonFormat(pattern = "yyyyMMddHHmmss", timezone = "GMT+8")
    private LocalDateTime payTime;
}
