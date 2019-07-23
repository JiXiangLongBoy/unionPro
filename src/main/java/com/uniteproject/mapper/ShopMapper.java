package com.uniteproject.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ShopMapper {
    int addShop(int goodsId, int userId, int goodsNum);


    void updateShop(int goodsId, int userId, int goodsNum);

    int selectGoodsNum(int goodsId, int userId);

    void deleteShop(int goodsId, int userId);
}
