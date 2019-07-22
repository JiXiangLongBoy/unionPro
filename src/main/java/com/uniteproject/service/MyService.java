package com.uniteproject.service;

import com.uniteproject.pojo.Cyclopedia;
import com.uniteproject.pojo.Goods;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MyService {
    List<Cyclopedia> getCyclopediaById(int userId);

    List<Goods> getShopTro(int userId);
}
