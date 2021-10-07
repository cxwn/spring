package com.ivandu.spring.aop.diy;

public class DiyPointCut {
    public void before(){
        System.out.println("AOP方式二：方法执行前... ...");
    }

    public void after(){
        System.out.println("AOP方式二：方法执行后... ...");
    }
}
