package com.jetlion.service.impl;

import com.jetlion.entity.User;
import com.jetlion.service.UserService;
import org.springframework.stereotype.Service;

@Service("UserServiceImpl3")
public class UserServiceImpl3 implements UserService {

    @Override
    public User getUserById(int id) {
        //这边测试返回null，即可验证byName
        return null;
    }
}
