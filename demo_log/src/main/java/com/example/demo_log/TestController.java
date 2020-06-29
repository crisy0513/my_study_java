package com.example.demo_log;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangchenxin
 * @date 2020/6/29  16:10
 * @desc
 */

@RestController
public class TestController {

    @RequestMapping("/index")
    @SysLogger(value = "Hellohellohello")
    public String index(){
        return "Hello";
    }
}
