package com.ivandu.spring.autowired.pojo;

public class UserB {
    private String name;

    public UserB(){
        System.out.println("UserB 被创建了！");
    }

    public UserB(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public void show(){
        System.out.println("My name is " + name + ".");
    }
}
