package com.example.demo_hystrix;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author wangchenxin
 * @date 2020/6/24  11:18
 * @desc
 */
@FeignClient(value="spring-cloud-client",fallback = FeignHystrixError.class)
public interface FeighClientHystrix {
    @GetMapping("/hello")
    String sayhellofromeurekaclient(@RequestParam(value="name") String name);
}
