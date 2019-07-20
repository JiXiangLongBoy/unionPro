package com.uniteproject.service;

import com.uniteproject.pojo.BannerUrl;
import com.uniteproject.pojo.Cyclopedia;
import com.uniteproject.pojo.Foods;
import org.springframework.boot.Banner;

import java.util.List;

public interface JinNangService {
    BannerUrl getBannerUrl();

    List<Cyclopedia> getEssay();

    List<Foods> getFoods();
}
