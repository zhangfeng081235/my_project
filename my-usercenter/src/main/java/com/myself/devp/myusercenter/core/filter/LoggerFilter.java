package com.myself.devp.myusercenter.core.filter;

import feign.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
public class LoggerFilter {
    @Bean
    Logger.Level FeignLoggerLevel(){
        return Logger.Level.FULL;
    }

    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("bean.xml");
        SpringProcessor springProcessor =  (SpringProcessor)applicationContext.getBean("springProcessor");
        String id = springProcessor.getId();
        String name = springProcessor.getName();
        System.out.println(springProcessor);
        System.out.println(id+"|"+name);
    }
}
