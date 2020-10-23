package com.eureka.devp.myeureka1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
@EnableEurekaClient
public class MyEureka1Application {

    public static void main(String[] args) {
        SpringApplication.run(MyEureka1Application.class, args);
    }

}
