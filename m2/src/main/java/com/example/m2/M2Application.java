package com.example.m2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 注册中心
 */
@SpringBootApplication
@EnableEurekaServer
public class M2Application {

    public static void main(String[] args) {
        SpringApplication.run(M2Application.class, args);
    }

}
