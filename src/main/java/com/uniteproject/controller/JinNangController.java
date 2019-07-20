package com.uniteproject.controller;

import com.uniteproject.pojo.BannerUrl;
import com.uniteproject.pojo.Cyclopedia;
import com.uniteproject.pojo.Foods;
import com.uniteproject.service.JinNangService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JinNangController {

    @Autowired
    JinNangService jinNangService;

    @ApiOperation("获取轮播图的地址，返回的数据是锦囊主页面的Banner轮播图的Url地址")
    @RequestMapping("/bannerUrl")
    public BannerUrl  getBanner(){

       BannerUrl bannerUrl = jinNangService.getBannerUrl();
        System.out.println(bannerUrl);

        return bannerUrl;
    }

    @ApiOperation("返回文章的描述，以及在读次数，CyclopediaDesc描述，number播放次数")
    @RequestMapping("/essay")
    public List<Cyclopedia> getEssay(){

        List<Cyclopedia> cyclopediasList = jinNangService.getEssay();

        return cyclopediasList;
    }
    @ApiOperation("返回食谱主页需要展示菜品数据，foodsName是菜的名字，foodsDesc是菜品的描述 ")
    @RequestMapping("/recipe")
    public List<Foods> getRecipe(){

        List<Foods> foodsList = jinNangService.getFoods();

        return foodsList;
    }
}
