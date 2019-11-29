package com.ccsens.tall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @description:
 * @author: wuHuiJuan
 * @create: 2019/11/26 15:04
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class TallApplication {
    public static void main(String[] args) {
        SpringApplication.run(TallApplication.class, args);
    }
}
