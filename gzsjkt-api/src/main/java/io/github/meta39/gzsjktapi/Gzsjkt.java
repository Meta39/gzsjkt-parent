package io.github.meta39.gzsjktapi;

/**
 * 广州市健康通公共 api
 */
public interface Gzsjkt<T> {

    /**
     * 公共执行方法
     * 如果只有service、resultCode、resultDesc需要返回，响应对象填 Void 对象。
     * 如果业务代码需要抛出错误信息，请直接 throw new RuntimeException("错误提示信息");
     * @param req 请求对象
     * @return 响应对象
     */
    Object execute(T req);

}