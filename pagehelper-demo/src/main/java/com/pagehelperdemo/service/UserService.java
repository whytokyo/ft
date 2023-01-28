package com.pagehelperdemo.service;

import com.pagehelperdemo.domain.User;

import java.util.List;

/**
 * <p>
 * 用户信息表 服务类
 * </p>
 *
 * @author BlueFire
 * @since 2021-03-21
 */
public interface UserService {

    //通过用户名查询用户信息
    User selectUserByUserName(String username);

    List<User> selectByConditions(User user);

    int addUser(User user);
}
