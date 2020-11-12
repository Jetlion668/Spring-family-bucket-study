package com.jetlion.service.impl;

import com.jetlion.dao.UserDAO;
import com.jetlion.service.UserService;
import com.jetlion.entity.User;

public class UserServiceImpl implements UserService {

    private UserDAO userDAO;

    @Override
    public User getUserById(int id) {
        return userDAO.getUserById(id);
    }

    public UserDAO getUserDAO() {
        return userDAO;
    }

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }
}
