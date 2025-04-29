# gzsjkt-parent
```text
父 pom 管理版本依赖
```

## gzsjkt-api
1. 医院HIS提供给广州市健康通的接口
2. 关于重复类名定义为类名 + 1的解释：防止引入错误的类。
3. 关于金额使用 Long 的解释：因为广州市健康通使用的金额单位为分，所以使用 Long 防止金额单位填错为元
4. 关于日期时间类型分别使用 LocalDate、LocalDateTime 的解释：防止因为时间长度导致的错误，而且使用 JDK8 新日期时间类型，性能更高，转换更方便

### gzsjkt-api 底层框架
1. JSON、XML序列化和反序列化框架Jackson