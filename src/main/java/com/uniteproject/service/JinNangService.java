package com.uniteproject.service;

import com.uniteproject.pojo.*;
import org.springframework.boot.Banner;

import java.util.List;

public interface JinNangService {
    BannerUrl getBannerUrl();

    List<Cyclopedia> getEssay();

    List<FoodsType> getFoodsTypeList();

    List<Foods> getFoodsByName(String foodsName);

    List<Foods> queryFoodsByTypeId(int foodsTypeId);

    FoodsInfo getFoodsInfo(int foodsId);
}
