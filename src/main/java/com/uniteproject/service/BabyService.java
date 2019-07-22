package com.uniteproject.service;

import com.uniteproject.pojo.Baby;
import com.uniteproject.pojo.BabyDid;
import com.uniteproject.pojo.UserImage;

import java.util.List;

public interface BabyService {

    //int insertUserImageByBabyId(String fileName, String babyId);

    Baby selectBabyById(int babyId);


    List<UserImage> showAllImg(int userId);



    List<BabyDid> selectbabydid(int userId);


    int insertUserImage(String s1, String s, int userId);
}
