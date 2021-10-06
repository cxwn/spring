package com.ivandu.spring;

import com.ivandu.spring.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IoCTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserServiceImpl userService =(UserServiceImpl)context.getBean("UserServiceImpl");
        userService.getUser();
    }
}
