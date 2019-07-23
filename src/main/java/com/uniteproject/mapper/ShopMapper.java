package com.uniteproject.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ShopMapper {
    int addShop(int goodsId, int userId, int goodsNum);


    void updateShop(int goodsNum, int goodsId,int userId);
}
