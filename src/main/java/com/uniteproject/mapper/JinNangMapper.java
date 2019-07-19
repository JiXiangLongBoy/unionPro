package com.uniteproject.mapper;

import com.uniteproject.pojo.BannerUrl;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface JinNangMapper {
    BannerUrl getBannerUrl();
}
