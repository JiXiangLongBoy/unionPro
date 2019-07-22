package com.uniteproject.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;


import java.util.Date;

public class AppGoods {
    @ApiModelProperty("评价id")
    public int appId;
    @ApiModelProperty("用户id")
    public int userId;
    @ApiModelProperty("商品id")
    public int goodsId;
    @ApiModelProperty("评价描述")
    public String appDesc;
    @ApiModelProperty("评价的图片")
    public String appImg;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    @ApiModelProperty("评价的时间")
    public Date appTime;

    @ApiModelProperty("用户名称")
    public String username;
    @ApiModelProperty("商品mc")
    public String goodsName;
    @ApiModelProperty("用户头像")
    public String headImg;

    @Override
    public String toString() {
        return "AppGoods{" +
                "appId=" + appId +
                ", userId=" + userId +
                ", goodsId=" + goodsId +
                ", appDesc='" + appDesc + '\'' +
                ", appImg='" + appImg + '\'' +
                ", appTime=" + appTime +
                ", username='" + username + '\'' +
                ", goodsName='" + goodsName + '\'' +
                ", headImg='" + headImg + '\'' +
                '}';
    }

    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    public int getAppId() {
        return appId;
    }

    public void setAppId(int appId) {
        this.appId = appId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    public String getAppDesc() {
        return appDesc;
    }

    public void setAppDesc(String appDesc) {
        this.appDesc = appDesc;
    }

    public String getAppImg() {
        return appImg;
    }

    public void setAppImg(String appImg) {
        this.appImg = appImg;
    }

    public Date getAppTime() {
        return appTime;
    }

    public void setAppTime(Date appTime) {
        this.appTime = appTime;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }
}
