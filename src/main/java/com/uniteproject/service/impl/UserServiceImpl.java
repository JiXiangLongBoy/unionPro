package com.uniteproject.service.impl;

import com.uniteproject.mapper.UserMapper;
import com.uniteproject.pojo.LoginResult;
import com.uniteproject.pojo.User;
import com.uniteproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    UserMapper userMapper;

    @Override
    public LoginResult isLogin(User user) {

        int count = userMapper.login(user);

        if (count == 1) {
            int id = userMapper.isLogin(user);
            return new LoginResult(1,id,"用户名验证登录成功");
        } else {
            return new LoginResult(0,0,"用户名或密码错误，登陆失败");
        }
    }
}
