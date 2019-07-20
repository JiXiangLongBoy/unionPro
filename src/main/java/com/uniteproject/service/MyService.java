package com.uniteproject.service;

import com.uniteproject.pojo.Cyclopedia;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MyService {
    List<Cyclopedia> getCyclopediaById(int userId);
}
