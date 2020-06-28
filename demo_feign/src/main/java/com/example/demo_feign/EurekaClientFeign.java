package com.example.demo_feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author wangchenxin
 * @date 2020/6/24  10:17
 * @desc
 */

@FeignClient(value="spring-cloud-client")
public interface EurekaClientFeign {
    @GetMapping("/hello")
    String sayhellofromeurekaclient(@RequestParam(value="name") String name);
}
