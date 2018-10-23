package com.example.server.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 描述：
 *
 * @author: 曾远征
 * @date: 2018-10-23
 * @time: 22:51
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class ServerZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerZuulApplication.class, args);
    }
}
