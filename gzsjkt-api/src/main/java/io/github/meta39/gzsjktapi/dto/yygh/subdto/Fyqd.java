package io.github.meta39.gzsjktapi.dto.yygh.subdto;

import lombok.Data;

@Data
public final class Fyqd {
    /**
     * 收费项⽬名称
     */
    private String xmmc;

    /**
     * 收费项⽬代码
     */
    private String xmdm;

    /**
     * 收费项⽬数量
     */
    private String xmsl;

    /**
     * 收费项⽬单位
     */
    private String xmdw;

    /**
     * 收费项⽬单价，计量单位为分
     */
    private Long xmdj;

    /**
     * 收费项⽬总⾦额，计量单位为分
     */
    private Long xmzje;

    /**
     * 事件项⽬代码，关联费⽤清单数据集关联检验⽀付完成事件、检验取号完成事件、检验完成事件、报告产⽣事件）
     */
    private String sjxmdm;

    /**
     * ⽀付完成状态。
     * 0.未⽀付
     * 1.已⽀付
     * 2.已退费
     */
    private Integer zfzt;

    /**
     * ⽀付渠道类型。
     * 1.⾃费
     * 2.医保
     */
    private Integer zflx;
}
