package com.ivandu.spring.anno.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class User {
    @Value("Shelly")
    public String name;

    @Value("Polly")
    public void setName(String name) {
        this.name = name;
    }
}
