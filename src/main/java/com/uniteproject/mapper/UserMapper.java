package com.uniteproject.mapper;



import com.uniteproject.pojo.User;
import com.uniteproject.pojo.UserImage;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    int isLogin(User user);

    int login(User user);

    int getHeadCount();

    List<User> headList(int count);

    int selectUserByEmail(String email);

    int selectUserByUserName(String userName);

    int insertUser(User user);


}
