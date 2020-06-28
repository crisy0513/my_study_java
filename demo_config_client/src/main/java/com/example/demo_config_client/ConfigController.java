package com.example.demo_config_client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangchenxin
 * @date 2020/6/28  9:43
 * @desc
 */

@RestController
public class ConfigController {
    @Value("${neo.hello}")
    private String hello;

    @RequestMapping("/config")
    public String hello(){
        return "config"+this.hello;
    }

}
