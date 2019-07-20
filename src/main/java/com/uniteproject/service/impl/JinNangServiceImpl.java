package com.uniteproject.service.impl;

import com.uniteproject.mapper.JinNangMapper;
import com.uniteproject.pojo.BannerUrl;
import com.uniteproject.pojo.Cyclopedia;
import com.uniteproject.pojo.Foods;
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
    public List<Foods> getFoods() {

        List<Foods> foodsList =  jinNangMapper.getFoods();

        return foodsList;
    }
}
