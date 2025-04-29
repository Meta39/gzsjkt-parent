package io.github.meta39.gzsjktapi.auto;

import io.github.meta39.gzsjktapi.Gzsjkt;
import io.github.meta39.gzsjktapi.dto.Res;
import io.github.meta39.gzsjktapi.util.JacksonUtils;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;
import java.util.stream.Collectors;

/**
 * 统一接口入口
 */
@Slf4j
@RestController
@RequiredArgsConstructor
public final class GzsjktController {
    private static final Integer interfaceDoesNotExist = -1;//接口不存在状态码
    private static final String interfaceDoesNotExistMessage = "接口不存在";//接口不存在默认异常信息
    private static final Integer fail = 1;//业务异常状态码
    private static final Integer validate = 2;//参数校验失败状态码
    //注入Spring容器的类
    private final Validator validator;

    @PostMapping(value = "/doReqToHis", consumes = MediaType.APPLICATION_XML_VALUE, produces = MediaType.APPLICATION_XML_VALUE)
    @SuppressWarnings("unchecked")
    public <T> String doReqToHis(@RequestParam("service") String service, @RequestBody String body) {
        //校验 bean 是否存在
        Gzsjkt<T> gzsjkt;
        try {
            gzsjkt = (Gzsjkt<T>) BeanUtils.getBean(service, Gzsjkt.class);
        } catch (Exception e) {
            Res res = new Res(service, interfaceDoesNotExist, service + interfaceDoesNotExistMessage);
            return JacksonUtils.objectToXml(res);
        }
        Class<T> parameterType = (Class<T>) ServiceTypeCache.getParameterType(service);
        T requestBodyObject = JacksonUtils.xmlToObject(body, parameterType);

        //校验参数
        Set<ConstraintViolation<T>> violations = validator.validate(requestBodyObject);
        if (!violations.isEmpty()) {
            String errorMessage = violations.stream()
                    .map(v -> v.getPropertyPath() + ": " + v.getMessage())
                    .collect(Collectors.joining("; "));
            Res res = new Res(service, validate, errorMessage);
            return JacksonUtils.objectToXml(res);
        }

        //执行业务
        try {
            Object responseObject = gzsjkt.execute(requestBodyObject);
            //返回值是空，则使用默认成功
            if (ObjectUtils.isEmpty(responseObject)) {
                responseObject = new Res(service);
            }
            if (responseObject instanceof Res) {
                ((Res) responseObject).changeService(service);
            }
            String responseXml = JacksonUtils.objectToXml(responseObject);
            log.info("{}入参:{}\n出参:{}", service, body, responseXml);
            return responseXml;
        } catch (Exception e) {
            String message = e.getMessage();
            Res res = new Res(service, fail, message);
            log.error("{}入参:{}\n异常:{}", service, body, message, e);
            return JacksonUtils.objectToXml(res);
        }
    }

}
