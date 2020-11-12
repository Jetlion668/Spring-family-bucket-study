package com.jetlion.service.impl;

import com.jetlion.dao.UserDAO;
import com.jetlion.entity.User;
import com.jetlion.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl2 implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public User getUserById(int id) {
        return userDAO.getUserById(id);
    }
}
