package com.uniteproject.pojo;

import io.swagger.annotations.ApiModelProperty;

public class GoodsType {
    @ApiModelProperty(value = "商品类型Id",example = "0")
    private int goodsTypeId;
    @ApiModelProperty("商品类型名称")
    private String typeName;

    @Override
    public String toString() {
        return "GoodsType{" +
                "goodsTypeId=" + goodsTypeId +
                ", typeName='" + typeName + '\'' +
                '}';
    }

    public int getGoodsTypeId() {
        return goodsTypeId;
    }

    public void setGoodsTypeId(int goodsTypeId) {
        this.goodsTypeId = goodsTypeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}
