package com.uniteproject.controller;

import com.uniteproject.pojo.User;
import com.uniteproject.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;


    @ApiOperation("验证登录账号密码，用户名正确返回1，并返回大于0的token值，否则返回0，注意此接口只需要username和password两个参数")
    @RequestMapping("/login")
    public User testDemo(User user) {

        User isLogin= userService.isLogin(user);
        System.out.println(isLogin+"!");

            return isLogin;
    }

}
