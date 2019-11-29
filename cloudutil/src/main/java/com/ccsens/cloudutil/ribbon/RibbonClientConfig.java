package com.ccsens.cloudutil.ribbon;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Configuration;

/**
 * @description:
 * @author: wuHuiJuan
 * @create: 2019/11/26 12:11
 */
@Configuration
@RibbonClient(name="${spring.application.name}", configuration = RibbonConfiguration.class)
public class RibbonClientConfig {
}
