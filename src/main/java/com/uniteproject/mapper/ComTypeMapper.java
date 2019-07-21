package com.uniteproject.mapper;

import com.uniteproject.pojo.ComType;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ComTypeMapper {
    List<ComType> getComTypeList();
}
