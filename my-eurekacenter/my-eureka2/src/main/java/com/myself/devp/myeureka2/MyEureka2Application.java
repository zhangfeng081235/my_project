package com.myself.devp.myeureka2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MyEureka2Application {

    public static void main(String[] args) {
        SpringApplication.run(MyEureka2Application.class, args);
    }

}
