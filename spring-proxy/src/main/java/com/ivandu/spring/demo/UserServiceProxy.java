package com.ivandu.spring.demo;

import com.ivandu.spring.demo.impl.UserServiceImpl;

public class UserServiceProxy implements UserService{

    private UserServiceImpl userService;

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    @Override
    public void add() {
        log();
        userService.add();
    }

    @Override
    public void delete() {
        log();
        userService.delete();
    }

    @Override
    public void update() {
        log();
        userService.update();
    }

    @Override
    public void query() {
        log();
        userService.query();
    }
    public void log(){
        System.out.println("增加日志");
    }
}
