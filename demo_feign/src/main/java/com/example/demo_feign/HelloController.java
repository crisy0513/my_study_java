package com.example.demo_feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangchenxin
 * @date 2020/6/24  10:21
 * @desc
 */
@RestController
public class HelloController {
    @Autowired
    EurekaClientFeign eurekaClientFeign;

    @RequestMapping("/hello")
    public String sayhello(String name){
        return eurekaClientFeign.sayhellofromeurekaclient(name);
    }
}
