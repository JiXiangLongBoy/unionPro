package com.uniteproject.controller;

import com.uniteproject.pojo.Cyclopedia;
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
@CrossOrigin//允许跨域访问
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
}