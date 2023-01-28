package com.pagehelperdemo.mapper;

import com.pagehelperdemo.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {
    User selectUserByUserName(@Param("userName") String username);

    List<User> selectUserList();

    List<User> selectByConditions(User user);

    int addUser(User user);
}
