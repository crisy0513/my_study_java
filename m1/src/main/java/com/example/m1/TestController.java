package com.example.m1;

import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangchenxin
 * @date 2020/6/22  10:15
 * @desc
 */
@RestController
public class TestController {
    @RequestMapping("/index")
    public String test(){
        return "success!";
    }
}
