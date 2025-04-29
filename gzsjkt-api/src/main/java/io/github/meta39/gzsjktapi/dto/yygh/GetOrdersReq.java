package io.github.meta39.gzsjktapi.dto.yygh;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

import java.time.LocalDate;

/**
 * 批量订单查询
 */
@Data
@JacksonXmlRootElement(localName = "req")
public final class GetOrdersReq {
    /**
     * 医院代码
     */
    private String hospitalId;

    /**
     * 开始日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private LocalDate startDate;

    /**
     * 结束日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private LocalDate endDate;

    /**
     * 订单状态：
     * 0：未取号（爽约）
     * 1：已取号（就诊）
     * 2：已退费/未付费取消
     */
    private Integer orderStutes;

}
