package com.uniteproject.service;

import com.uniteproject.pojo.Community;

import java.util.List;

public interface CommunityService {
    List<Community> getCommunityByType(int comTypeId);


}
