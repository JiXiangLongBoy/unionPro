package com.uniteproject.pojo;

import io.swagger.annotations.ApiModelProperty;

public class Shop {
    @ApiModelProperty("购物车id")
    private Integer shopId ;
    @ApiModelProperty("用户id")
    private Integer userId;
    @ApiModelProperty("商品id")
    private Integer goodsId;
    @ApiModelProperty("商品数量")
    private Integer goodsNum;

    @Override
    public String toString() {
        return "Shop{" +
                "shopId=" + shopId +
                ", userId=" + userId +
                ", goodsId=" + goodsId +
                ", goodsNum=" + goodsNum +
                '}';
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(Integer goodsNum) {
        this.goodsNum = goodsNum;
    }
}
