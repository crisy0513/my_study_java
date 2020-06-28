package com.example.demo_eureka_client;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangchenxin
 * @date 2020/6/23  16:23
 * @desc
 */

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(String name){
        return "Hello," + name+",Im one";
    }
}
