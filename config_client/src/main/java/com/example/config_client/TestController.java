package com.example.config_client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangchenxin
 * @date 2020/6/22  14:48
 * @desc
 */

@RestController
@RefreshScope
public class TestController {

    @Value("${neo.hello}")
    private String hello;

    @RequestMapping("/hello")
    public String hello(){
        return "client1"+this.hello;
    }
}
