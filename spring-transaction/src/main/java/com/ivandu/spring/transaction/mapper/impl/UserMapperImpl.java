package com.ivandu.spring.transaction.mapper.impl;

import com.ivandu.spring.transaction.mapper.UserMapper;
import com.ivandu.spring.transaction.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper {

    @Override
    public List<User> selectUser() throws Exception {
        User user = new User(5,"Jim", "23244");
        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
        mapper.addUser(user); // 验证事务
        mapper.deleteUser(5); // 验证事务
        return mapper.selectUser();
    }

    @Override
    public int addUser(User user) throws Exception{
        return getSqlSession().getMapper(UserMapper.class).addUser(user);
    }

    @Override
    public int deleteUser(int id) throws Exception{
        return getSqlSession().getMapper(UserMapper.class).deleteUser(id);
    }
}
