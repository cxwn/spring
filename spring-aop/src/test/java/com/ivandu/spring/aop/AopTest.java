package com.ivandu.spring.aop;

import com.ivandu.spring.aop.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService user = context.getBean("userService", UserService.class);
        user.add();
    }
}
