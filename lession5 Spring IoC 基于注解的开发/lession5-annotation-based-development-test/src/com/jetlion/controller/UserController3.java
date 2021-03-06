package com.jetlion.controller;

import com.jetlion.entity.User;
import com.jetlion.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class UserController3 {

    @Autowired
    @Qualifier("UserServiceImpl3")
    private UserService userService;

    public User getUserById(int id){
        return userService.getUserById(id);
    }

}
