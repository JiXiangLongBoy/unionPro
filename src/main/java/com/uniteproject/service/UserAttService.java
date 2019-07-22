package com.uniteproject.service;

import com.uniteproject.pojo.UserAtt;

import java.util.List;

public interface UserAttService {
    List<UserAtt> attList(int userId);
}
