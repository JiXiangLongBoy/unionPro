package com.uniteproject.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ShopMapper {
    void addShop(int goodsId, int userId, int goodsNum);
}
