package com.uniteproject.mapper;

import com.uniteproject.pojo.Baby;
import com.uniteproject.pojo.UserImage;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BabyMapper {

    int insertUserImageByBabyId(String fileName, String babyId);

    Baby selectBabyById(int babyId);
}
