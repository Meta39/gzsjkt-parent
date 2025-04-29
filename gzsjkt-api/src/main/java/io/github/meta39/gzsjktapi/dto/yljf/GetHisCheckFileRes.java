package io.github.meta39.gzsjktapi.dto.yljf;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.github.meta39.gzsjktapi.dto.Res;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 对账文件生成接口
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@JacksonXmlRootElement(localName = "res")
public final class GetHisCheckFileRes extends Res {
    /**
     * 对账文件状态
     * Y－文件已生成
     * N－文件未生成
     * I－文件正在生成
     */
    private String fileStatus;

}
