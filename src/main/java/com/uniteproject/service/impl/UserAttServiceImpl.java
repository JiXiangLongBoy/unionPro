package com.uniteproject.service.impl;

import com.uniteproject.mapper.UserAttMapper;
import com.uniteproject.pojo.UserAtt;
import com.uniteproject.service.UserAttService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserAttServiceImpl implements UserAttService {
    @Autowired
    UserAttMapper userAttMapper;
    @Override
    public List<UserAtt> attList(int userId) {
        return userAttMapper.attList(userId);
    }
}
