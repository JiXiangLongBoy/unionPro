package com.uniteproject.controller;

import com.uniteproject.pojo.BannerUrl;
import com.uniteproject.service.JinNangService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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


}
