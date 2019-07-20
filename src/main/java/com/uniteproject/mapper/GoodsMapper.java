package com.uniteproject.mapper;

import com.uniteproject.pojo.Goods;

import java.util.List;

public interface GoodsMapper {
    List<Goods> getGoodsByType(int num, int goodsTypeId,int count);

    List<Goods> getGoodsList(int count);

    int getGoodsCount();

    Goods getGoodsById(int goodsId);
}
