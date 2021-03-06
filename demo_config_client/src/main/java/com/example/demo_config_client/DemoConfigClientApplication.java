package com.example.demo_config_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DemoConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoConfigClientApplication.class, args);
    }

}
