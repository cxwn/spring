package com.ivandu.spring.mybatis.mapper;

import com.ivandu.spring.mybatis.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> selectUser() throws Exception;
}
