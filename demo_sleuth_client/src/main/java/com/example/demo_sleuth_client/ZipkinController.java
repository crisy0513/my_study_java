package com.example.demo_sleuth_client;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangchenxin
 * @date 2020/6/28  13:23
 * @desc
 */
@RestController
public class ZipkinController {

    @RequestMapping("/zipkin")
    public String zipkin(){
        return "Im zipkin client";
    }
}
