package com.example.client.authority;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 描述：
 *
 * @author: 曾远征
 * @date: 2018-10-23
 * @time: 23:04
 */
@SpringBootApplication
@EnableEurekaClient
public class ClientAuthorityApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientAuthorityApplication.class, args);
    }
}
