package com.uniteproject.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModelProperty;

//食谱的实体类
public class Foods {

    @ApiModelProperty("菜品的Id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private int foodsId;

    @ApiModelProperty("菜品的名字")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String foodsName;

    @ApiModelProperty("菜品的描述")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String foodsDesc;
    @ApiModelProperty("菜品的类型id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private int foodsTypeId;
    @ApiModelProperty("菜品对应的孕期Id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private int stageId;

    @ApiModelProperty("菜品的类型名字")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private int typeName;


    public int getFoodsId() {
        return foodsId;
    }

    public void setFoodsId(int foodsId) {
        this.foodsId = foodsId;
    }

    public String getFoodsName() {
        return foodsName;
    }

    public void setFoodsName(String foodsName) {
        this.foodsName = foodsName;
    }

    public String getFoodsDesc() {
        return foodsDesc;
    }

    public void setFoodsDesc(String foodsDesc) {
        this.foodsDesc = foodsDesc;
    }

    public int getFoodsTypeId() {
        return foodsTypeId;
    }

    public void setFoodsTypeId(int foodsTypeId) {
        this.foodsTypeId = foodsTypeId;
    }

    public int getStageId() {
        return stageId;
    }

    public void setStageId(int stageId) {
        this.stageId = stageId;
    }

    @Override
    public String toString() {
        return "Foods{" +
                "foodsId=" + foodsId +
                ", foodsName='" + foodsName + '\'' +
                ", foodsDesc='" + foodsDesc + '\'' +
                ", foodsTypeId=" + foodsTypeId +
                ", stageId=" + stageId +
                '}';
    }
}
