package com.ivandu.spring.config;

import com.ivandu.spring.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(IvanConfig.class);
        User user = context.getBean("getUser", User.class);
        System.out.println(user.getName());
    }
}
