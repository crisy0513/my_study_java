package com.example.m1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangchenxin
 * @date 2020/6/22  10:15
 * @desc
 */
@RestController
public class TestController {
    @RequestMapping("/hello")
    public String test(@RequestParam String name){
        return "Hello,"+name+",this is first message!";
    }
}
