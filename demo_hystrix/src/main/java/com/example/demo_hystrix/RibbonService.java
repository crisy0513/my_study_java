package com.example.demo_hystrix;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author wangchenxin
 * @date 2020/6/24  11:01
 * @desc
 */

@Service
public class RibbonService {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "helloerror")
    public String hello(String name){
        return restTemplate.getForObject("http://spring-cloud-client/hello?name="+name,String.class);
    }

    public String helloerror(String name){
        return "Hello,"+name+",sorry,error";
    }
}
