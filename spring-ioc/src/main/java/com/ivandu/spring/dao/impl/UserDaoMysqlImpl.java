package com.ivandu.spring.dao.impl;

import com.ivandu.spring.dao.UserDao;

public class UserDaoMysqlImpl implements UserDao {
    public void getUser(){
        System.out.println("MySQL获取用户数据");
    }
}
