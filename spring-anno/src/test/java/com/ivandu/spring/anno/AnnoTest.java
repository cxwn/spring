package com.ivandu.spring.anno;

import com.ivandu.spring.anno.controller.UserController;
import com.ivandu.spring.anno.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnoTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = context.getBean("user", User.class);
        UserController userController = context.getBean("userController", UserController.class);
        System.out.println(user.name);
        System.out.println(userController.userControllerName);
    }
}
