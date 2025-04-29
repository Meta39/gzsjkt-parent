package io.github.meta39.gzsjktapi.dto.yygh;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.github.meta39.gzsjktapi.dto.Res;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 医院信息查询
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@JacksonXmlRootElement(localName = "res")
public final class GetHospitalInfoRes extends Res {
    /**
     * 医院ID
     */
    private String hospitalId;

    /**
     * 医院名称
     */
    private String hospitalName;

    /**
     * 医院地址
     */
    private String addr;

    /**
     * 医院电话
     */
    private String tel;

    /**
     * 医院网址
     */
    private String webSite;

    /**
     * 医院等级
     * 1：一级医院
     * 2：二级医院
     * 3：三级医院
     */
    private Integer hospLevel;

    /**
     * 所在区域（行政区划代码）
     */
    private String hospArea;

    /**
     * 医院简介
     */
    private String desc;

    /**
     * 最大预约天数
     */
    private String maxRegDays;

    /**
     * 开始预约时间
     * 格式：HH:mm
     */
    private String startRegTime;

    /**
     * 停止预约时间
     * 格式：HH:mm
     */
    private String stopRegTime;

    /**
     * 上午停止取号时间
     * 格式：HH:mm
     */
    private String stopBookTimeM;

    /**
     * 下午停止取号时间
     * 格式：HH:mm
     */
    private String stopBookTimeA;
}
