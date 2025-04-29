package io.github.meta39.gzsjktapi.dto.yljf;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

import java.time.LocalDate;

/**
 * 已缴费记录查询接口
 */
@Data
@JacksonXmlRootElement(localName = "req")
public final class GetCompletedPayInfoReq {
    /**
     * 医院代码
     */
    private String hospitalId;

    /**
     * 缴费类型
     * 1 或空-普通医疗处方缴费
     * 2-产前筛查处方缴费
     */
    private Integer payType;

    /**
     * 用户健康卡号码若不支持新流程则，当前为必输项( 还不支付医保卡及市民卡的查询)
     */
    private String userJKK;

    /**
     * 用户医保卡号码
     */
    private String userYBK;

    /**
     * 用户市民卡号码
     */
    private String userSMK;

    /**
     * 就诊卡（可代替健康卡，医保卡，市民卡）
     */
    private String medicalCard;

    /**
     * 查询开始日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private LocalDate startDate;

    /**
     * 查询结束日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private LocalDate endDate;

}
