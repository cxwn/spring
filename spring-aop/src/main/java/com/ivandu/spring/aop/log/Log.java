package com.ivandu.spring.aop.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class Log implements MethodBeforeAdvice {

    // method: 要执行的目标对象的方法
    // agrs：参数
    // target：目标对象
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable{
        System.out.println("AOP方式一：" + target.getClass().getName() + "的" + method.getName() + "方法被执行了");
    }
}
