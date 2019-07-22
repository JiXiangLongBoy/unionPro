package com.uniteproject.service.impl;

import com.uniteproject.mapper.GoodsMapper;
import com.uniteproject.pojo.Goods;
import com.uniteproject.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    GoodsMapper goodsMapper;
    @Override
    public List<Goods> getGoodsByType(int goodsTypeId,int num) {
        int count = goodsMapper.getGoodsTypeCount(goodsTypeId);
        int goodsCount = count-num;
        List<Goods> goods = goodsMapper.getGoodsByType(goodsTypeId, num, goodsCount);
        return goods;
    }

    @Override
    public List<Goods> getGoodsList() {
        int result = goodsMapper.getGoodsCount();
        int count = 0;
        if(result>12){
            result =result-12;
            count = (int)(Math.random()*(result)+1);
        }else{
            count = (int)(Math.random()*(result)+1);
        }
        return goodsMapper.getGoodsList(count);
    }

    @Override
    public Goods getGoodsById(int goodsId) {
        return goodsMapper.getGoodsById(goodsId);
    }
}
