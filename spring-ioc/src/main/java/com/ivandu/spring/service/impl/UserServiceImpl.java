package com.ivandu.spring.service.impl;

import com.ivandu.spring.dao.UserDao;
import com.ivandu.spring.dao.impl.UserDaoImpl;
import com.ivandu.spring.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}
