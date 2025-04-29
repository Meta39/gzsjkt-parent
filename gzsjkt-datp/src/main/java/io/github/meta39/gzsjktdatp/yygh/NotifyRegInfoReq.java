package io.github.meta39.gzsjktdatp.yygh;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

/**
 * 号源同步通知接口（返回Res）
 */
@Data
@JacksonXmlRootElement(localName = "req")
public class NotifyRegInfoReq {

    /**
     * 医院代码
     */
    private String hospitalId;

}
