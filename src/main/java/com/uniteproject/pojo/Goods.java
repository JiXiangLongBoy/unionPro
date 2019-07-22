package com.uniteproject.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModelProperty;

public class Goods {
    @ApiModelProperty("商品id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private int goodsId;
    @ApiModelProperty("商品名称")
    private String goodsName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @ApiModelProperty("商品价格")
    private int goodsPrice;
    @ApiModelProperty("商品图片")
    private String goodsImg;
    @ApiModelProperty("商品描述")
    private String goodsDecs;


    @ApiModelProperty(value = "商品类型Id",example = "0")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private int goodsTypeId;
    @ApiModelProperty("商品评价")
    private String goodsP;

    @ApiModelProperty("商品类型名称")
    private String typeName;

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
                '}';
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
