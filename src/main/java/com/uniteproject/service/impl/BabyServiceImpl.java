package com.uniteproject.service.impl;

import com.uniteproject.mapper.BabyMapper;
import com.uniteproject.pojo.Baby;
import com.uniteproject.pojo.UserImage;
import com.uniteproject.service.BabyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BabyServiceImpl implements BabyService {

    @Autowired
    BabyMapper babyMapper;



    @Override
    public int insertUserImageByBabyId(String fileName, String babyId) {

        return babyMapper.insertUserImageByBabyId(fileName,babyId);
    }

    @Override
    public Baby selectBabyById(int babyId) {
        return babyMapper.selectBabyById(babyId);
    }

 /*   @Override
    public String selectcommunity(int communityId) {

        return babyMapper.selectcommunity(communityId);
    }*/


}
