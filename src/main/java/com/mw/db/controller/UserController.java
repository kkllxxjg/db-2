package com.mw.db.controller;

import com.mw.db.dao.AjaxResult;
import com.mw.db.dao.UserMapper;
import com.mw.db.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;

    // http://127.0.0.1:8080/users
    @GetMapping("/users")
    public AjaxResult selectUserList() {
        List<User> list = userMapper.selectUserList();
        AjaxResult result = AjaxResult.success().data(list);
        return result;
    }

    // http://127.0.0.1:8080/users/1
    @GetMapping("/users/{id}")
    public AjaxResult selectById(@PathVariable int id) {
        User item = userMapper.selectUserById(id);
        AjaxResult result = AjaxResult.success().data(item);
        return result;
    }


}

