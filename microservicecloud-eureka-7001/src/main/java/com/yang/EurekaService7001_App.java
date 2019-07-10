package com.yang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author djy
 * @date 2019-07-03 17:24
 */

@SpringBootApplication
@EnableEurekaServer//EurekaServer服务器端启动类
public class EurekaService7001_App {
    public static void main(String[] args)
    {
        SpringApplication.run(EurekaService7001_App.class, args);
    }
}
