package com.yang.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author djy
 * @date 2019-07-03 17:24
 */

@SpringBootApplication
@EnableEurekaClient
public class DeptProvider8001_App{
    public static void main(String[] args)
    {
        SpringApplication.run(DeptProvider8001_App.class, args);
    }
}
