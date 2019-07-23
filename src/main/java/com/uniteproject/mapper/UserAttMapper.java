package com.uniteproject.mapper;

import com.uniteproject.pojo.UserAtt;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserAttMapper {
    List<UserAtt> attList(int userId);
}
