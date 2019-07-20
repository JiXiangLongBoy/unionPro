package com.uniteproject.service;

import com.uniteproject.pojo.Baby;
import com.uniteproject.pojo.UserImage;

public interface BabyService {

    int insertUserImageByBabyId(String fileName, String babyId);

    Baby selectBabyById(int babyId);

   // String selectcommunity(int communityId);
}
