package com.uniteproject.mapper;

import com.uniteproject.pojo.Cyclopedia;
import com.uniteproject.pojo.Goods;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface MyMapper {
    List<Cyclopedia> getCyclopediaById(int userId);

    List<Goods> getShopTro(int userId);
}
