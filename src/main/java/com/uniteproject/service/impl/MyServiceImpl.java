package com.uniteproject.service.impl;

import com.uniteproject.mapper.MyMapper;
import com.uniteproject.pojo.Cyclopedia;
import com.uniteproject.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyServiceImpl implements MyService {

  @Autowired
  MyMapper myMapper;
    @Override
    public List<Cyclopedia>  getCyclopediaById(int userId) {
        return myMapper.getCyclopediaById(userId);
    }
}