package com.ivandu.spring.config;

import com.ivandu.spring.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.ivandu.spring.pojo")
@Import(MariaConfig.class)
public class MariaConfig {
    @Bean
    public User getUser(){
        return new User();
    }
}
