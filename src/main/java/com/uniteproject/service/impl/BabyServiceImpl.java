package com.uniteproject.service.impl;

import com.uniteproject.mapper.BabyMapper;
import com.uniteproject.mapper.CommunityMapper;
import com.uniteproject.pojo.Baby;
import com.uniteproject.pojo.BabyDid;
import com.uniteproject.pojo.Community;
import com.uniteproject.pojo.UserImage;
import com.uniteproject.service.BabyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BabyServiceImpl implements BabyService {

    @Autowired
    BabyMapper babyMapper;

    @Autowired
    CommunityMapper communityMapper;



    @Override
    public int insertUserImageByBabyId(String fileName, String babyId) {

        return babyMapper.insertUserImageByBabyId(fileName,babyId);
    }

    @Override
    public Baby selectBabyById(int babyId) {
        return babyMapper.selectBabyById(babyId);
    }

    @Override
    public List<UserImage> showAllImg(int userId) {

        return babyMapper.showAllImg(userId);
    }

    @Override
    public List<BabyDid> selectbabydid(int userId) {


        return babyMapper.selectbabydid(userId);
    }


}
