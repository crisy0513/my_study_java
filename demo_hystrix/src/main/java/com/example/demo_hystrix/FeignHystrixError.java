package com.example.demo_hystrix;

import org.springframework.stereotype.Component;

/**
 * @author wangchenxin
 * @date 2020/6/24  11:21
 * @desc
 */

@Component
public class FeignHystrixError implements FeighClientHystrix {
    @Override
    public String sayhellofromeurekaclient(String name) {
        return "sorry," + name + ", frign error! ";
    }
}
