package com.uniteproject.controller;

import com.uniteproject.pojo.LoginResult;
import com.uniteproject.pojo.User;
import com.uniteproject.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;


    @ApiOperation("验证登录账号密码，用户名正确返回1，并返回大于0的token值，否则返回0，此接口只需要username和password两个参数,其他参数用于注册使用")
    @RequestMapping("/login")
    public LoginResult testDemo(User user) {
        LoginResult loginResult= userService.isLogin(user);
            return loginResult;
    }
    @ApiOperation("查询注册时邮箱是否存在，存在返回fail,不存在返回sucess")
    @RequestMapping("/validateEmail")
    @ResponseBody
    public String validateEmail(String email){

        boolean isExist = userService.validateEmail(email);
        //数据库操作
        return isExist?"fail":"success";
    }
    @ApiOperation("查询注册时账户名是否存在，存在返回fail,不存在返回sucess")
    @RequestMapping("/validateUserName")
    @ResponseBody
    public String validateUaerName(String userName){

        boolean isExist = userService.validateUserName(userName);
        //数据库操作
        return isExist?"fail":"success";
    }

    @ApiOperation("注册功能，像数据库插入注册信息")
    @RequestMapping("/insertUser")
    @ResponseBody
    public String insertUser(User user){
        int result = userService.insertUser(user);
        System.out.println("插入数据后是否可以获取一个值："+result);
        return result > 0 ? "success":"fail";
    }


}
