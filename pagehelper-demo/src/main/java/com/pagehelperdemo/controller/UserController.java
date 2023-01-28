package com.pagehelperdemo.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pagehelperdemo.common.model.dto.ResponseResult;
import com.pagehelperdemo.domain.User;
import com.pagehelperdemo.mapper.UserMapper;
import com.pagehelperdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/system/user")
@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public ResponseResult<List<User>> userList(@RequestParam(name = "pageNum", defaultValue = "1") int pageNum,
                                               @RequestParam(name = "pageSize", defaultValue = "10") int pageSize,
                                               User user) {
        PageHelper.startPage(pageNum, pageSize);
        List<User> list = userService.selectByConditions(user);
        PageInfo<User> page = new PageInfo<>(list);
        return ResponseResult.okResult(page);
    }

    @PutMapping("/add")
    public ResponseResult addUser(@RequestBody User user) {
        int res = userService.addUser(user);
        return ResponseResult.okResult(res);
    }

}
