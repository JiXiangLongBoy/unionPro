package com.uniteproject.service.impl;

import com.uniteproject.mapper.ComTypeMapper;
import com.uniteproject.pojo.ComType;
import com.uniteproject.service.ComTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ComTypeServiceImpl implements ComTypeService {
    @Autowired
    ComTypeMapper comTypeMapper;
    @Override
    public List<ComType> getComTypeList() {
        return comTypeMapper.getComTypeList();
    }
}
