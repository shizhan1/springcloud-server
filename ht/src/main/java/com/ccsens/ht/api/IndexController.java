package com.ccsens.ht.api;

import com.ccsens.cloudutil.bean.QueryParam;
import com.ccsens.cloudutil.feign.TallFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;


/**
 * @description:
 * @author: wuHuiJuan
 * @create: 2019/11/26 15:01
 */
@RestController
public class IndexController {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private TallFeignClient tallFeignClient;

    @RequestMapping("get/{id}")
    public String get(@PathVariable("id") Long id) throws JSONException {

//        return restTemplate.getForObject("http://tall/getPort", String.class);

        Map t = new HashMap();
        t.put("name","zs");
        t.put("age",1);
        QueryParam json = new QueryParam();
        json.setT(t);
        json.setUserId(id);
        String s = tallFeignClient.get(json);
//        String s = tallFeignClient.index();
        return s;

    }

    @RequestMapping({"","/","/index"})
    public String index(){
        return "hello world:";
    }

}
