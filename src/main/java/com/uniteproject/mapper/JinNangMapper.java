package com.uniteproject.mapper;

import com.uniteproject.pojo.BannerUrl;
import com.uniteproject.pojo.Cyclopedia;
import com.uniteproject.pojo.Foods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface JinNangMapper {
    BannerUrl getBannerUrl();

    List<Cyclopedia> getEssay();

    List<Foods> getFoods();
}
