package io.github.meta39.gzsjktapi.dto.yygh.subdto;

import lombok.Data;

@Data
public final class DeptInfo {
    /**
     * 科室代码（发热门诊科室代码统一为：FEVER_001）
     */
    private String deptId;

    /**
     * 科室名称（发热门诊科室名称统一为：发热门诊或者发热诊室）
     */
    private String deptName;

    /**
     * 上级科室代码,没有填-1
     */
    private String parentId;

    /**
     * 科室简介
     */
    private String desc;

    /**
     * 科室排序号
     */
    private String sortNo;

    /**
     * 是否为发热门诊科室1-是0-否
     */
    private Integer hasFever;

}
