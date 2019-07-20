package com.uniteproject.service.impl;

import com.uniteproject.mapper.GoodsTypeMapper;
import com.uniteproject.pojo.GoodsType;
import com.uniteproject.service.GoodsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GoodsTypeServiceImpl implements GoodsTypeService {
    @Autowired
    GoodsTypeMapper goodsTypeMapper;
    @Override
    public List<GoodsType> getTypeList() {
        return goodsTypeMapper.getTypeList();
    }
}
