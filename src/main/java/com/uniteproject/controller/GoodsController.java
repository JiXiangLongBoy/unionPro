package com.uniteproject.controller;

import com.uniteproject.pojo.*;
import com.uniteproject.service.*;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GoodsController {
    @Autowired
    UserService userService;
    @Autowired
    GoodsService goodsService;
    @Autowired
    GoodsTypeService goodsTypeService;
    @Autowired
    AppGoodsService appGoodsService;
    @Autowired
    ComTypeService comTypeService;
    @Autowired
    CommunityService communityService;

    @RequestMapping("/headList")
    @ApiOperation("获取用户头像，随机12条，")
    @CrossOrigin//允许跨域访问
    public List<User> headList(){
        return userService.headList();
    }

    @RequestMapping("/typeList")
    @ApiOperation("获取商品类型名称，用于优品页面商品类型标签")
    @CrossOrigin//允许跨域访问
    public List<GoodsType> typeList(){
        return goodsTypeService.getTypeList();
    }
    @RequestMapping("/getGoodsByType")
    @ApiOperation("需要传商品类型id,查询信息数量（int goodsTypeId ,int num），通过点击商品类型名称，得到对应类型的最新商品，用于清洁，喂养等标签")
    @CrossOrigin//允许跨域访问
    public List<Goods> getGoodsByType(int goodsTypeId ,int num){
       return goodsService.getGoodsByType(goodsTypeId,num);
    }

    @RequestMapping("/goodsList")
    @ApiOperation("获取随机12条商品信息，用于宝宝必备")
    @CrossOrigin//允许跨域访问
    public List<Goods> goodsList(){
        return goodsService.getGoodsList();
    }
    @RequestMapping("/getGoodsById")
    @ApiOperation("需要传递商品id（int goodsId），获取单个商品信息，用于商品界面")
    @CrossOrigin//允许跨域访问
    public Goods getGoodsById(int goodsId){
        return goodsService.getGoodsById(goodsId);
    }

    @RequestMapping("/getAppGoods")
    @ApiOperation("获取所有评价信息，用于评价页面")
    @CrossOrigin//允许跨域访问
    public List<AppGoods> appGoodsList(){
        return appGoodsService.getAppGoodsList();
    }

    @RequestMapping("/comTypeList")
    @ApiOperation("获取社区表模块类型列表：备孕、孕期。。")
    @CrossOrigin//允许跨域访问
    public List<ComType> comTypeList(){
        return comTypeService.getComTypeList();
    }
    @RequestMapping("/getCommunityByType")
    @ApiOperation("需要传递社区类型id（int comTypeId），获取对应社区表模块类型的动态评论")
    @CrossOrigin//允许跨域访问
    public List<Community> getCommunityByType(int comTypeId){
        return communityService.getCommunityByType(comTypeId);
    }
}
