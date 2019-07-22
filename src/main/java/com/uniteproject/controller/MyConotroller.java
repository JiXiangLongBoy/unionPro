package com.uniteproject.controller;

import com.uniteproject.pojo.BannerUrl;
import com.uniteproject.pojo.Cyclopedia;
import com.uniteproject.pojo.Goods;
import com.uniteproject.service.JinNangService;
import com.uniteproject.service.MyService;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyConotroller {
    @Autowired
    MyService myService;




    @ApiOperation("我的收藏，根据用户ID返回收藏的百科问答文章")
    @RequestMapping("/mycollection" )
    public List<Cyclopedia> secelectCyclopediaByUserId(int userId){

        List<Cyclopedia> cyclopedia = myService.getCyclopediaById(userId);
        System.out.println(cyclopedia);
        return cyclopedia;
    }
    @ApiOperation("我的订单，返回该用户所有订单，根据订单的状态码判断属于哪个状态。0代表代未付款，1代表未收货，2代表未发货，3代表已完成，4代表未评价，5代表售后")
    @RequestMapping("/myOrder")
    public List<Goods>  selectGoodsByuserId(int userId){

        System.out.println(myService.getGoodsByUserId(userId));
        return myService.getGoodsByUserId(userId);

    }



}
