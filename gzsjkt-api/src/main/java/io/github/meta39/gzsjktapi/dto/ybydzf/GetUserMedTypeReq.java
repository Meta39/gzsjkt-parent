package io.github.meta39.gzsjktapi.dto.ybydzf;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

/**
 * 用户医保类型身份查询
 */
@Data
@JacksonXmlRootElement(localName = "req")
public final class GetUserMedTypeReq {
    /**
     * 身份证号码
     */
    private String userIdCard;

    /**
     * 预留字段（暂未开放）
     */
    private String cardType;

    /**
     * 预留字段（暂未开放）
     */
    private String hosId;

    /**
     * 预留字段（暂未开放）
     */
    private String depId;

}
