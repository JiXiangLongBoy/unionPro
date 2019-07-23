package com.uniteproject.mapper;

import com.uniteproject.pojo.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface JinNangMapper {
    BannerUrl getBannerUrl();

    List<Cyclopedia> getEssay();


    List<FoodsType> getFoodsTypeList();

    List<Foods> getFoodsByName(String foodsName);

    List<Foods> queryFoodsByTypeId(int foodsTypeId);

    FoodsInfo getFoodsInfo(int foodsId);

    List<Period> getPeriod();

    List<Foods> getfoodsByPeriodId(int periodId);
}
