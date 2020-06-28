package com.example.demo_ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author wangchenxin
 * @date 2020/6/24  9:15
 * @desc
 */
@Service
public class RibbonService {
    @Autowired
    RestTemplate restTemplate;

    public String hello(String name){
        return restTemplate.getForObject("http://spring-cloud-client/hello?name="+name,String.class);
    }
}
