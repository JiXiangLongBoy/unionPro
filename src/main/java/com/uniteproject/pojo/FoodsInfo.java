package com.uniteproject.pojo;

import java.util.List;

public class FoodsInfo {

    private int id;
    private String foodsImgUrl;
    private String foodsDesc;
    private List<FoodsInfoIssue> foodsInfoIssue;
    private int foodsId;

    public int getFoodsId() {
        return foodsId;
    }

    public void setFoodsId(int foodsId) {
        this.foodsId = foodsId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFoodsImgUrl() {
        return foodsImgUrl;
    }

    public void setFoodsImgUrl(String foodsImgUrl) {
        this.foodsImgUrl = foodsImgUrl;
    }

    public String getFoodsDesc() {
        return foodsDesc;
    }

    public void setFoodsDesc(String foodsDesc) {
        this.foodsDesc = foodsDesc;
    }

    public List<FoodsInfoIssue> getFoodsInfoIssue() {
        return foodsInfoIssue;
    }

    public void setFoodsInfoIssue(List<FoodsInfoIssue> foodsInfoIssue) {
        this.foodsInfoIssue = foodsInfoIssue;
    }

    @Override
    public String toString() {
        return "FoodsInfo{" +
                "id=" + id +
                ", foodsImgUrl='" + foodsImgUrl + '\'' +
                ", foodsDesc='" + foodsDesc + '\'' +
                ", foodsInfoIssue=" + foodsInfoIssue +
                ", foodsId=" + foodsId +
                '}';
    }
}
