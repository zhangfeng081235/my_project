package com.myself.devp.myusercenter.core.filter;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoggerFilter {
    @Bean
    Logger.Level FeignLoggerLevel(){
        return Logger.Level.FULL;
    }

}
