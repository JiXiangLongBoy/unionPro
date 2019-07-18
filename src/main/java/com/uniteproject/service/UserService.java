package com.uniteproject.service;

import com.uniteproject.pojo.LoginResult;
import com.uniteproject.pojo.User;

public interface UserService {
    LoginResult isLogin(User user);
}
