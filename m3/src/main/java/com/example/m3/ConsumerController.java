package com.example.m3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangchenxin
 * @date 2020/6/22  11:42
 * @desc
 */

@RestController
public class ConsumerController {
    @Autowired
    Remote remote;

    @RequestMapping("/remote")
    public String remote(String name){
        return remote.hello(name);
    }
}
