package com.ivandu.spring.aop.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AnnotationPointCut {

    @Before("execution(* com.ivandu.spring.aop.service.impl.UserServiceImpl.*(..))")
    public void before() {
        System.out.println("=========AOP方式三（注解实现)：执行前==========");
    }

    @After("execution(* com.ivandu.spring.aop.service.impl.UserServiceImpl.*(..))")
    public void after() {
        System.out.println("=========AOP方式三（注解实现）：执行后==========");
    }

    @Around("execution(* com.ivandu.spring.aop.service.impl.UserServiceImpl.*(..))")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("环绕前");
        Signature signature = proceedingJoinPoint.getSignature();
        System.out.println("打印签名信息：" + signature);
        Object proceed = proceedingJoinPoint.proceed();
        System.out.println("打印处理信息：" + proceed);
        System.out.println("环绕后");
        return proceed;
    }
}
