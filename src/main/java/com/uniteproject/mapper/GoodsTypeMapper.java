package com.uniteproject.mapper;

import com.uniteproject.pojo.GoodsType;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface GoodsTypeMapper {
    List<GoodsType> getTypeList();
}
