package com.jetlion.controller;

import com.jetlion.service.UserService;
import com.jetlion.entity.User;

public class UserController {

    private UserService userService;

    public User getUserById(int id){
        return userService.getUserById(id);
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
