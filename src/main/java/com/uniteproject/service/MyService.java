package com.uniteproject.service;

import com.uniteproject.pojo.Cyclopedia;
import com.uniteproject.pojo.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MyService {
    List<Cyclopedia> getCyclopediaById(int userId);

    List<Goods> getGoodsByUserId(int userId);
}
