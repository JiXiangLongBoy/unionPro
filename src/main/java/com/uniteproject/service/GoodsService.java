package com.uniteproject.service;

import com.uniteproject.pojo.Goods;

import java.util.List;

public interface GoodsService {
    List<Goods> getGoodsByType(int goodsTypeId,int num);

    List<Goods> getGoodsList();

    Goods getGoodsById(int goodsId);
}
