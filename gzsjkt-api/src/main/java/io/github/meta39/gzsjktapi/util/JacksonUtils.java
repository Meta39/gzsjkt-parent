package io.github.meta39.gzsjktapi.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

/**
 * Jackson json/xml序列化和反序列化工具类
 */
public final class JacksonUtils {
    private JacksonUtils() {}

    private static final ObjectMapper JSON;
    private static final XmlMapper XML;

    static {
        // json 配置
        JSON = new ObjectMapper();
        JSON.setSerializationInclusion(JsonInclude.Include.NON_NULL);//只序列化非空变量
        JSON.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);//禁用空值检查
        JSON.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);//禁用反序列化未知变量检查
        JSON.registerModule(new JavaTimeModule());//支持JDK8新日期
        // xml 配置
        XML = new XmlMapper();
        XML.configure(ToXmlGenerator.Feature.WRITE_XML_DECLARATION, true);// 启用XML声明
        XML.setSerializationInclusion(JsonInclude.Include.NON_NULL);//只序列化非空变量
        XML.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);//禁用空值检查
        XML.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);//禁用反序列化未知变量检查
        XML.registerModule(new JavaTimeModule());//支持JDK8新日期
    }

    /**
     * 把对象序列化成json字符串
     */
    public static String objectToJson(Object object) {
        try {
            return JSON.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 把json字符串反序列化成对象
     */
    public static <T> T jsonToObject(String json, Class<T> clazz) {
        try {
            return JSON.readValue(json, clazz);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 把json字符串反序列化成对象
     */
    public static <T> T jsonToObject(String json, TypeReference<T> objectTypeRef) {
        try {
            return JSON.readValue(json, objectTypeRef);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 把对象序列化成xml字符串
     */
    public static String objectToXml(Object object) {
        try {
            return XML.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 把xml字符串反序列化成对象
     */
    public static <T> T xmlToObject(String xml, Class<T> clazz) {
        try {
            return XML.readValue(xml, clazz);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 把xml字符串反序列化成对象
     */
    public static <T> T xmlToObject(String xml, TypeReference<T> objectTypeRef) {
        try {
            return XML.readValue(xml, objectTypeRef);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

}
