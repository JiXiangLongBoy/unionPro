package com.uniteproject.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AddDynMapper {
    void addAtt(int userId, int addUserAttId);
}
