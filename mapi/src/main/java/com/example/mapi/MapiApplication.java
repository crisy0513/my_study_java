package com.example.mapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MapiApplication {

    public static void main(String[] args) {
        SpringApplication.run(MapiApplication.class, args);
    }

}
