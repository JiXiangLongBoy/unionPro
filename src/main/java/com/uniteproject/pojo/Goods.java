package com.uniteproject.pojo;

import io.swagger.annotations.ApiModelProperty;

public class Goods {
    @ApiModelProperty("商品id")
    private int goodsId;
    @ApiModelProperty("商品名称")
    private String goodsName;
    @ApiModelProperty("商品价格")
    private int goodsPrice;
    @ApiModelProperty("商品图片")
    private String goodsImg;
    @ApiModelProperty("商品描述")
    private String goodsDecs;
    @ApiModelProperty("商品类型Id")
    private int goodsTypeId;
    @ApiModelProperty("商品评价")
    private String goodsP;

    @ApiModelProperty("商品类型名称")
    private String typeName;

    @ApiModelProperty("用于展示商品状态的状态码")
    private int status;

    @Override
    public String toString() {
        return "Goods{" +
                "goodsId=" + goodsId +
                ", goodsName='" + goodsName + '\'' +
                ", goodsPrice=" + goodsPrice +
                ", goodsImg='" + goodsImg + '\'' +
                ", goodsDecs='" + goodsDecs + '\'' +
                ", goodsTypeId=" + goodsTypeId +
                ", goodsP='" + goodsP + '\'' +
                ", typeName='" + typeName + '\'' +
                ", status=" + status +
                '}';
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public int getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(int goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getGoodsImg() {
        return goodsImg;
    }

    public void setGoodsImg(String goodsImg) {
        this.goodsImg = goodsImg;
    }

    public String getGoodsDecs() {
        return goodsDecs;
    }

    public void setGoodsDecs(String goodsDecs) {
        this.goodsDecs = goodsDecs;
    }

    public int getGoodsTypeId() {
        return goodsTypeId;
    }

    public void setGoodsTypeId(int goodsTypeId) {
        this.goodsTypeId = goodsTypeId;
    }

    public String getGoodsP() {
        return goodsP;
    }

    public void setGoodsP(String goodsP) {
        this.goodsP = goodsP;
    }
}
