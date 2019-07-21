package com.uniteproject.service.impl;

import com.uniteproject.mapper.CommunityMapper;
import com.uniteproject.pojo.Community;
import com.uniteproject.service.CommunityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CommunityServiceImpl implements CommunityService {
    @Autowired
    CommunityMapper communityMapper;
    @Override
    public List<Community> getCommunityByType(int comTypeId) {
        return communityMapper.getCommunityByType(comTypeId);
    }


}
