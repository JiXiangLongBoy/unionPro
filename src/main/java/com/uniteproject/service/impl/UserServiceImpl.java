package com.uniteproject.service.impl;

import com.uniteproject.mapper.UserMapper;
import com.uniteproject.pojo.User;
import com.uniteproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    UserMapper userMapper;

    @Override
    public User isLogin(User user) {

        User isLogin = new User();
        int count = userMapper.login(user);

        if (count == 1) {
            int id = userMapper.isLogin(user);
            isLogin.setId(id);
            isLogin.setStatus(1);
        } else {
            isLogin.setStatus(0);
        }
        return isLogin;
    }
}
