package com.uniteproject.service.impl;

import com.uniteproject.mapper.AppGoodsMapper;
import com.uniteproject.pojo.AppGoods;
import com.uniteproject.service.AppGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AppGoodsServiceImpl implements AppGoodsService {
    @Autowired
    AppGoodsMapper appGoodsMapper;
    @Override
    public List<AppGoods> getAppGoodsList() {
        return appGoodsMapper.getAppGoodsList();
    }
}
