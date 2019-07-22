package com.uniteproject.service.impl;

import com.uniteproject.mapper.ShopMapper;
import com.uniteproject.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShopServiceImpl implements ShopService {
    @Autowired
    ShopMapper shopMapper;
    @Override
    public void addShop(int goodsId, int userId, int goodsNum) {
        shopMapper.addShop(goodsId,userId,goodsNum);
    }
}
