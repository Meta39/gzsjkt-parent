package io.github.meta39.gzsjktapi.dto.yljf;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

import java.time.LocalDate;

/**
 * 对账文件生成接口
 */
@Data
@JacksonXmlRootElement(localName = "req")
public final class GetHisCheckFileReq {
    /**
     * 医院代码
     */
    private String hospitalId;

    /**
     * 对账文件日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private LocalDate checkDate;

}
