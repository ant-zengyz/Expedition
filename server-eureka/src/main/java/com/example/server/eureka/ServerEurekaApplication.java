package com.example.server.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 描述：
 * @author: 曾远征
 * @date: 2018-10-21
 * @time: 0:25
 */
@SpringBootApplication
@EnableEurekaServer
public class ServerEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerEurekaApplication.class, args);
    }
}
