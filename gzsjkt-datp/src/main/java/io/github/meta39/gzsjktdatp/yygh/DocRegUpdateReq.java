package io.github.meta39.gzsjktdatp.yygh;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

import java.time.LocalDate;

/**
 * 医生换班调班通知接口（返回Res）
 */
@Data
@JacksonXmlRootElement(localName = "req")
public class DocRegUpdateReq {

    /**
     * 医院代码
     */
    private String hospitalId;

    /**
     * 科室代码
     */
    private String deptId;

    /**
     * 医生代码
     */
    private String doctorId;

    /**
     * 日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private LocalDate regDate;

    /**
     * 时段
     * 1:上午
     * 2:下午
     * 3:晚上
     * 4:全部
     */
    private Integer timeFlag;

    /**
     * 1 调班
     * 2 换班
     */
    private Integer regType;

    /**
     * 发送给用户信息文案
     */
    private String reason;

}
