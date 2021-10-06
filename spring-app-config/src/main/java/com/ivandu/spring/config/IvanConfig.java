package com.ivandu.spring.config;

import com.ivandu.spring.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.ivandu.spring.pojo")
public class IvanConfig {
    @Bean
    public User getUser(){
        return new User();
    }
}
