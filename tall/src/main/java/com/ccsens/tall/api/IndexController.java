package com.ccsens.tall.api;

import com.ccsens.cloudutil.bean.QueryParam;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: wuHuiJuan
 * @create: 2019/11/26 15:06
 */
@RestController
public class IndexController {

    @Value("${server.port}")
    private String port;


    @RequestMapping({"","/","/index"})
    public String index(){
        return "hello world";
    }

    @RequestMapping("getPort")
    public String getPort(@RequestBody QueryParam param){
        return param.getUserId()+":" + param.getT()+"=========================="+port;
    }
}
