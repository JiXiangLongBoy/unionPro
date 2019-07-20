package com.uniteproject.mapper;

import com.uniteproject.pojo.Community;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface CommunityMapper {
    List<Community> getCommunityByType(int comTypeId);
}
