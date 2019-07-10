package com.yang;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author djy
 * @date 2019-07-03 17:24
 */

@SpringBootApplication

@EnableHystrixDashboard
public class DeptConsumer_Hystrix_DashBoard_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_Hystrix_DashBoard_App.class, args);
    }
}
