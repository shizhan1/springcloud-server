要开发的eureka服务，引用cloudutil包，引用application-util-dev.yml配置，启动类添加@EnableCircuitBreaker，@EnableFeignClients(basePackages = "com.ccsens.cloudutil.feign")注解，并扩大@SpringBootApplication扫描包的范围，需要把cloudutil的包也扫描进去，即可成为一个cloud客户端