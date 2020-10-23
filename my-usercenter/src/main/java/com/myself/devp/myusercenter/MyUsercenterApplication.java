package com.myself.devp.myusercenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.myself.devp.myusercenter")
public class MyUsercenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyUsercenterApplication.class, args);
    }

}
