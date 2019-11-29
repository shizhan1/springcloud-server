package com.ccsens.ht;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @description:
 * @author: wuHuiJuan
 * @create: 2019/11/26 14:58
 */
@EnableCircuitBreaker
@EnableFeignClients(basePackages = "com.ccsens.cloudutil.feign")
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class}, scanBasePackages = "com.ccsens")
public class HtApplication {
    public static void main(String[] args) {
        SpringApplication.run(HtApplication.class, args);
    }
}
