package io.github.meta39.gzsjktapi.dto.yygh;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.github.meta39.gzsjktapi.dto.Res;
import io.github.meta39.gzsjktapi.dto.yygh.subdto.DeptInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.List;

/**
 * 科室信息查询
 * 发热门诊接入说明：（两种方式选其一即可）
 * 方式一：需机构修改科室代码为 FEVER_001
 * 方式二：需机构新增 hasFever 字段
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@JacksonXmlRootElement(localName = "res")
public final class GetDeptInfoRes extends Res {
    /**
     * 科室信息的集合
     */
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<DeptInfo> deptInfo;
}
