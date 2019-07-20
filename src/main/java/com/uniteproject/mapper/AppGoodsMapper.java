package com.uniteproject.mapper;

import com.uniteproject.pojo.AppGoods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface AppGoodsMapper {
    List<AppGoods> getAppGoodsList();
}
