package com.uniteproject.pojo;

public class FoodsType {

    private int foodsTypeId;
    private String typeName;


    public int getFoodsTypeId() {
        return foodsTypeId;
    }

    public void setFoodsTypeId(int foodsTypeId) {
        this.foodsTypeId = foodsTypeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return "FoodsType{" +
                "foodsTypeId=" + foodsTypeId +
                ", typeName='" + typeName + '\'' +
                '}';
    }
}
