package com.example.demo_admin_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DemoAdminClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoAdminClientApplication.class, args);
    }

}
