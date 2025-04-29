package io.github.meta39.gzsjktapi.dto.yygh;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.github.meta39.gzsjktapi.dto.Res;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 医院用户信息确认接口（可选）
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@JacksonXmlRootElement(localName = "res")
public final class ConfirmUserRes extends Res {
    /**
     * 用户信息是否已确认：
     * 0:未确认（表示未在医院注册，不能使用自助终端机的功能）
     * 1:已确认（表示已在医院注册，可以使用自助终端机的功能）
     */
    private Integer isOk;

}
