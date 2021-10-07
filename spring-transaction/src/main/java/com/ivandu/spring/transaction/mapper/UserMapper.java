package com.ivandu.spring.transaction.mapper;

import com.ivandu.spring.transaction.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> selectUser() throws Exception;
    int addUser(User user) throws Exception;
    int deleteUser(int id) throws Exception;
}
