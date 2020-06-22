package com.example.m3;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author wangchenxin
 * @date 2020/6/22  11:41
 * @desc
 */
@FeignClient(name= "spring-cloud-producer",fallback = RemoteHystrix.class)
public interface Remote {
    @RequestMapping(value = "/hello")
    public String hello(@RequestParam(value = "name") String name);
}
