package com.uniteproject.controller;

import com.uniteproject.pojo.*;
import com.uniteproject.service.JinNangService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
public class JinNangController {

    @Autowired
    JinNangService jinNangService;

    @ApiOperation("获取轮播图的地址，返回的数据是锦囊主页面的Banner轮播图的Url地址")
    @CrossOrigin//允许跨域访问
    @RequestMapping("/bannerUrl")
    public BannerUrl  getBanner(){

       BannerUrl bannerUrl = jinNangService.getBannerUrl();
        System.out.println(bannerUrl);

        return bannerUrl;
    }

    @ApiOperation("返回文章的描述，以及在读次数，CyclopediaDesc描述，number播放次数")
    @RequestMapping("/essay")
    @CrossOrigin//允许跨域访问
    public List<Cyclopedia> getEssay(){

        List<Cyclopedia> cyclopediasList = jinNangService.getEssay();

        return cyclopediasList;
    }
    @ApiOperation("返回食谱主页需要展示菜品数据，foodsName是菜的名字，foodsDesc是菜品的描述 ")
    @RequestMapping("/recipe")
    @CrossOrigin//允许跨域访问
    public List<Recipe> getRecipe(){

        List<Recipe> foodsList = jinNangService.getRecipe();

        return foodsList;
    }

    @ApiOperation("此接口是食物类型界面搜索食物功能，根据输入的食品名称返回食品的对应功能,参数是输入的食品名称，如果参数为空，则返回所有的食物")
    @RequestMapping("/queryfoods")
    @CrossOrigin//允许跨域访问
    public List<Foods> queryFoods(String foodsName){

       List<Foods> foodsList= jinNangService.getFoodsByName(foodsName);

        return foodsList;
    }

    @ApiOperation("此接口返回食物的类型以及对应的id ")
    @RequestMapping("/foodstype")
    public List<FoodsType> foodstype(HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        List<FoodsType> foodsTypeList = jinNangService.getFoodsTypeList();

        return foodsTypeList;
    }
}