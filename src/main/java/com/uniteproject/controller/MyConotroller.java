package com.uniteproject.controller;

import com.uniteproject.pojo.BannerUrl;
import com.uniteproject.pojo.Cyclopedia;
import com.uniteproject.pojo.Goods;
import com.uniteproject.service.JinNangService;
import com.uniteproject.pojo.Goods;
import com.uniteproject.pojo.User;
import com.uniteproject.service.MyService;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin//允许跨域访问
@RequestMapping(method = {RequestMethod.GET,RequestMethod.POST})
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

    @ApiOperation("购物车，返回对应用户的购物车数据，需要的参数是用户的token值,返回值中的goodsNum是购物车的单品件数")
    @RequestMapping("/shoptro" )
    public List<Goods> shoptro(int userId){


        return myService.getShopTro(userId);

    }

    @ApiOperation("对应我的主页面信息接口，返回该用户的相关信息，需要的参数是用户的token值")
    @RequestMapping("/mymain" )
    public List<User> myMainInfo(int userId){


        return myService.getMyMainInfo(userId);

    }

    @ApiOperation("我的订单，返回该用户所有订单，根据订单的状态码判断属于哪个状态。0代表代未付款，1代表未收货，2代表未发货，3代表已完成，4代表未评价，5代表售后")
    @RequestMapping("/myOrder")
    public List<Goods>  selectGoodsByuserId(int userId){

        System.out.println(myService.getGoodsByUserId(userId));
        return myService.getGoodsByUserId(userId);

    }



}
