package io.github.meta39.gzsjktapi.dto.yygh;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.github.meta39.gzsjktapi.dto.Res;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 挂号接口(支持医保)
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@JacksonXmlRootElement(localName = "res")
public final class AddOrderRes extends Res {
    /**
     * 当 resultCode=0 时，不可为空，存放HIS 系统生成的订单号。（对于省二人医该字段处加上医院排队号）
     */
    private String orderIdHIS;

    /**
     * 用户标志（HIS 需要根据订单中的用户信息如身份证件号码判断是否在HIS 里存在的标志，在取号环节，如果该字段是0，则预约系统提示用户去挂号窗口登记注册）
     * 0- 初次就诊患者
     * 1- 复诊患者
     */
    private Integer userFlag;

    /**
     * 对于免取号医院，该值必传，HIS确定的就诊卡,his 内部就诊卡号（社保卡，健康卡，医院诊疗卡）
     */
    private String medicalCard;

    /**
     * 卡类型：
     * 0-医院内部诊疗卡（医院传过来的非临时卡，当返回不明确的时候设为该卡）
     * 1 -健康卡
     * 2 - 市民卡
     * 3 - 医保卡
     * 4 - 公费医疗证
     * 5 - 农合证
     * 6 - 集约平台内部就诊卡
     * 7 - 系统内部号
     * 9 - 其它卡类型
     */
    private Integer cardType;

}
