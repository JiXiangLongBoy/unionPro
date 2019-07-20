package com.uniteproject.mapper;

import com.uniteproject.pojo.Community;

import java.util.List;

public interface CommunityMapper {
    List<Community> getCommunityByType(int comTypeId);
}
