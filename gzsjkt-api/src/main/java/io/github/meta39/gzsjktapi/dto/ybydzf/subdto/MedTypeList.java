package io.github.meta39.gzsjktapi.dto.ybydzf.subdto;

import lombok.Data;

@Data
public final class MedTypeList {
    /**
     * 用户医保类型
     */
    private String userType;

    /**
     * 医保类型信息/介绍
     */
    private String medInfo;

    /**
     * 医保类型代码，医院内部识别医保类型的code
     */
    private String medCode;

    /**
     * 其它，预留字段可以为空，不传
     */
    private String medOth;
}
