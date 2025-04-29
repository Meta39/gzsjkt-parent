package io.github.meta39.gzsjktapi.dto.yygh;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

/**
 * 解除锁定（接口实现返回对象填Void）
 */
@Data
@JacksonXmlRootElement(localName = "req")
public final class UnlockRegReq {
    /**
     * 号源锁定ID（诊疗平台产生）
     */
    private String lockId;
}
