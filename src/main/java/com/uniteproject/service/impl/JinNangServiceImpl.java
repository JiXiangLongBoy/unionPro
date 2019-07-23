package com.uniteproject.service.impl;

import com.uniteproject.mapper.JinNangMapper;
import com.uniteproject.pojo.*;
import com.uniteproject.service.JinNangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JinNangServiceImpl implements JinNangService {

    @Autowired
    JinNangMapper jinNangMapper;

    @Override
    public BannerUrl getBannerUrl() {
        BannerUrl banner = jinNangMapper.getBannerUrl();
        return banner;
    }

    @Override
    public List<Cyclopedia> getEssay() {
        List<Cyclopedia> cyclopediaList = jinNangMapper.getEssay();
        return cyclopediaList;
    }

    @Override
    public List<FoodsType> getFoodsTypeList() {

        return jinNangMapper.getFoodsTypeList();
    }

    @Override
    public List<Foods> getFoodsByName(String foodsName) {

        return jinNangMapper.getFoodsByName(foodsName);
    }

    @Override
    public List<Foods> queryFoodsByTypeId(int foodsTypeId) {

        return jinNangMapper.queryFoodsByTypeId(foodsTypeId);
    }

    @Override
    public FoodsInfo getFoodsInfo(int foodsId) {
        return jinNangMapper.getFoodsInfo(foodsId);
    }

    @Override
    public List<Period> getPeriod() {
        return jinNangMapper.getPeriod();
    }

    @Override
    public List<Foods> getfoodsByPeriodId(int periodId) {
        return jinNangMapper.getfoodsByPeriodId(periodId);
    }
}
