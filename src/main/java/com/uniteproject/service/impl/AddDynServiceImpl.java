package com.uniteproject.service.impl;


import com.uniteproject.mapper.AddDynMapper;
import com.uniteproject.service.AddDynService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddDynServiceImpl implements AddDynService {
    @Autowired
    AddDynMapper addDynMapper;

    @Override
    public void addAtt(int userId, int addUserAttId) {
        addDynMapper.addAtt(userId,addUserAttId);
    }
}
