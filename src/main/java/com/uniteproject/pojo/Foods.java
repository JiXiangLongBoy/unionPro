package com.uniteproject.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

//食物的实体类
public class Foods {

    @ApiModelProperty("食物的Id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private int foodsId;

    @ApiModelProperty("食物的名字")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String foodsName;

    @ApiModelProperty("食物的描述")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String foodsDesc;
    @ApiModelProperty("食物的类型id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private int foodsTypeId;

    @ApiModelProperty("食物的类型名字")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private int typeName;

    @ApiModelProperty("食物对应的孕期Id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private int periodId;

    @ApiModelProperty("食物对应的孕期名称")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String periodName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<Period> period;

    public int getTypeName() {
        return typeName;
    }

    public int getPeriodId() {
        return periodId;
    }

    public void setPeriodId(int periodId) {
        this.periodId = periodId;
    }

    public String getPeriodName() {
        return periodName;
    }

    public void setPeriodName(String periodName) {
        this.periodName = periodName;
    }

    public void setTypeName(int typeName) {
        this.typeName = typeName;
    }

    public List<Period> getPeriod() {
        return period;
    }

    public void setPeriod(List<Period> period) {
        this.period = period;
    }

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


    @Override
    public String toString() {
        return "Foods{" +
                "foodsId=" + foodsId +
                ", foodsName='" + foodsName + '\'' +
                ", foodsDesc='" + foodsDesc + '\'' +
                ", foodsTypeId=" + foodsTypeId +
                ", typeName=" + typeName +
                ", period=" + period +
                '}';
    }
}
