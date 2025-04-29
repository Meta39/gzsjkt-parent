package io.github.meta39.gzsjktapi.dto.yygh;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * 科室候诊信息实时查询
 */
@Data
@JacksonXmlRootElement(localName = "req")
public final class GetDaptQueueInfoReq {
    /**
     * 医院代码
     */
    private String hospitalId;

    /**
     * 科室编号
     */
    private String deptId;

    /**
     * 获取时间（特殊格式 yyyy-MM-dd HH:mm ）
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm", timezone = "GMT+8")
    private LocalDateTime nowTime;

}
