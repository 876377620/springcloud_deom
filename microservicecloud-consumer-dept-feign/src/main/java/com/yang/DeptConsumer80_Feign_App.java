package com.yang;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author djy
 * @date 2019-07-03 17:24
 */

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.yang.cloud"})
@ComponentScan("com.yang")

public class DeptConsumer80_Feign_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80_Feign_App.class, args);
    }
}
