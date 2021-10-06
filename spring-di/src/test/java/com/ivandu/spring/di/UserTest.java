package com.ivandu.spring.di;

import com.ivandu.spring.di.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
    @Test
    public void testUser() {
       ApplicationContext context = new ClassPathXmlApplicationContext("user.xml");
       User user = context.getBean("user2", User.class);
       User user1 = context.getBean("user2", User.class);
        System.out.println(user==user1);
    }

}
