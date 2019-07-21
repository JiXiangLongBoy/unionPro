package com.uniteproject.service.impl;

import com.uniteproject.mapper.UserMapper;
import com.uniteproject.pojo.LoginResult;
import com.uniteproject.pojo.User;
import com.uniteproject.pojo.UserImage;
import com.uniteproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public List<User> headList() {
        int result = userMapper.getHeadCount();
        System.out.println(result);
        int count = 0;
        if(result>12){
            result =result-12;
             count = (int)(Math.random()*(result));
        }else{

             count = (int)(Math.random()*1);
        }
        System.out.println(count);
        List<User> users = userMapper.headList(count);
        System.out.println(users);
        return users;

    }

    @Override
    public boolean validateEmail(String email) {
        int count = userMapper.selectUserByEmail(email);
        return count > 0 ? true :false ;
    }

    @Override
    public boolean validateUserName(String userName) {
        int count = userMapper.selectUserByUserName(userName);
        return count > 0 ? true :false ;
    }

    @Override
    public int insertUser(User user) {


            return userMapper.insertUser(user);


    }


}
