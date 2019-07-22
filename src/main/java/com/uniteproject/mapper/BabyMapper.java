package com.uniteproject.mapper;

import com.uniteproject.pojo.Baby;
import com.uniteproject.pojo.BabyDid;
import com.uniteproject.pojo.UserImage;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BabyMapper {

    int insertUserImageByBabyId(String fileName, String babyId);

    Baby selectBabyById(int babyId);


    List<UserImage> showAllImg(int userId);

    List<BabyDid> selectbabydid(int userId);
}
