package com.example.m1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 服务提供者
 */
@EnableDiscoveryClient
@SpringBootApplication
public class M1Application {

    public static void main(String[] args) {
        SpringApplication.run(M1Application.class, args);
    }

}
