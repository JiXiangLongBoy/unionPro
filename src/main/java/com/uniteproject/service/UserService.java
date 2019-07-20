package com.uniteproject.service;

import com.uniteproject.pojo.LoginResult;
import com.uniteproject.pojo.User;

import java.util.List;

public interface UserService {
    LoginResult isLogin(User user);

    boolean validateEmail(String email);

    boolean validateUserName(String userName);

    int insertUser(User user);

    List<User> headList();
}
