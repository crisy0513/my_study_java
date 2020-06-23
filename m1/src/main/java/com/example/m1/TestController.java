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
        System.out.println("------------"+name+"-----------------");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Hello,"+name+",this is first message!";
    }
}
