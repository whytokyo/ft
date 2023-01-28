package com.pagehelperdemo.service.impl;

import com.pagehelperdemo.domain.User;
import com.pagehelperdemo.mapper.UserMapper;
import com.pagehelperdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectUserByUserName(String username) {
        return userMapper.selectUserByUserName(username);
    }

    @Override
    public List<User> selectByConditions(User user) {
        return userMapper.selectByConditions(user);
    }

    @Override
    public int addUser(User user) {
        return userMapper.addUser(user);
    }


}
