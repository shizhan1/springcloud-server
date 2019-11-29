package com.ccsens.cloudutil.feign;

import com.ccsens.cloudutil.bean.QueryParam;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * @description:
 * @author: wuHuiJuan
 * @create: 2019/11/27 10:03
 */
@FeignClient(name = "tall", fallback = TallFeignClientFallBack.class)
public interface TallFeignClient {
    /**
     * 获取
     * @param map
     * @return
     */
    @PostMapping("/getPort")
    String get(QueryParam map);

    @GetMapping("/")
    String index();
    /*
    1.如果使用url传参,加注解@PathVariable,不能传递对象,只能用作传递基本数值;
    2.如果使用get请求传递参数,同样不能传递对象,而且如果传递参数的话,需要用到@RequestParam标注名称
    3.传递对象请使用post方式,并且接收端使用@RequestBody注解
     */
}

@Component
class TallFeignClientFallBack implements TallFeignClient {
    @Override
    public String get(QueryParam map) {
        return "hello world";
    }

    @Override
    public String index() {
        throw new RuntimeException("网络繁忙，请稍后重试");
    }
}
