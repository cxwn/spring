package com.ivandu.spring.dao.impl;

import com.ivandu.spring.dao.UserDao;

public class UserDaoImpl implements UserDao {

    @Override
    public void getUser() {
        System.out.println("默认获取用户数据！");
    }
}
