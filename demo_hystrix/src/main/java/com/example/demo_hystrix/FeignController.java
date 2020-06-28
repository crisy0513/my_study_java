package com.example.demo_hystrix;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangchenxin
 * @date 2020/6/24  11:19
 * @desc
 */
@RestController
public class FeignController {
    @Autowired
    FeighClientHystrix feighClientHystrix;

    @RequestMapping("/hello_feign")
    public String sayhello(String name) {
        return feighClientHystrix.sayhellofromeurekaclient(name);
    }
}
