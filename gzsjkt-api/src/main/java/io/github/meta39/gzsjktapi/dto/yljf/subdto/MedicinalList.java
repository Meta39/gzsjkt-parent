package io.github.meta39.gzsjktapi.dto.yljf.subdto;

import lombok.Data;

@Data
public final class MedicinalList {
    /**
     * 药品/检验ID唯一（两个处方不能存在同一个ID号，因为该参数在数据库与平台订单号是双主键类型）
     */
    private String medicinalID;

    /**
     * 药品/检验名称
     */
    private String medicinalName;

    /**
     * 药品/检验单价（用于展示给用户看）单位：分
     */
    private Long medicinalAmout;

    /**
     * 药品类型
     */
    private String medicinalType;

    /**
     * 药品/检验数量
     */
    private String quantity;

    /**
     * 药品单位
     */
    private String medicinalUnit;

    /**
     * 药品规格
     */
    private String medicinalSpecs;

}
