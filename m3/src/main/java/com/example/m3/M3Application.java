package com.example.m3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 服务消费者
 */
@EnableDiscoveryClient//启用服务注册与发现
@EnableFeignClients//启用feign进行远程调用
@SpringBootApplication
public class M3Application {

    public static void main(String[] args) {
        SpringApplication.run(M3Application.class, args);
    }

}
