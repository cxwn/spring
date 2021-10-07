package com.ivandu.spring.transaction;

import com.ivandu.spring.transaction.mapper.UserMapper;
import com.ivandu.spring.transaction.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TransactionTest {
    public static void main(String[] args) throws Exception{
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper mapper = context.getBean("userMapper", UserMapper.class);
        for(User user: mapper.selectUser()){
            System.out.println(user);
        }
    }
}
