package com.example.demo_hystrix;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangchenxin
 * @date 2020/6/24  11:01
 * @desc
 */
@RestController
public class RibbonController {
    @Autowired
    RibbonService ribbonService;

    @RequestMapping("/hello")
    public String ribbonhystrix(String name){
        return ribbonService.hello(name);
    }
}
