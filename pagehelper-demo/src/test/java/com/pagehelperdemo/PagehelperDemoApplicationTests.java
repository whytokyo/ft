package com.pagehelperdemo;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pagehelperdemo.domain.User;
import com.pagehelperdemo.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class PagehelperDemoApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
        PageHelper.startPage(2, 10);
        List<User> list = userMapper.selectUserList();
//        PageInfo<User> pageInfo = new PageInfo<>(list);

        for (User user : list) {
            System.out.println("res: " + user);
        }
    }

    @Test
    void test01() {
        PageHelper.startPage(1, 10);
        List<User> list1 = userMapper.selectByConditions(new User("1"));
        for (User user : list1) {
            System.out.println("res: " + user);
        }
    }

}
