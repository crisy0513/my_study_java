package com.example.demo_ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangchenxin
 * @date 2020/6/24  9:18
 * @desc
 */
@RestController
public class RibbonController {
    @Autowired
    RibbonService ribbonService;

    @RequestMapping("/hello")
    public String hello(String name){
        return ribbonService.hello(name);
    }
}
