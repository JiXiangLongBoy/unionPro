package com.uniteproject.mapper;

import com.uniteproject.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int isLogin(User user);

    int login(User user);
}
