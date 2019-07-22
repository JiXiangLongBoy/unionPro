package com.uniteproject.pojo;

import io.swagger.annotations.ApiModelProperty;

public class UserImage {

    //用户相片id
    @ApiModelProperty(value = "用户相片id",example = "0")
    private int imgId;
    //用户id
    @ApiModelProperty(value = "用户id",example = "0")
    private int userId;
    //照片地址
    private String imgUrl;
    //照片描述
    private String imgDesc;


    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getImgDesc() {
        return imgDesc;
    }

    public void setImgDesc(String imgDesc) {
        this.imgDesc = imgDesc;
    }

    @Override
    public String toString() {
        return "UserImage{" +
                "imgId=" + imgId +
                ", userId=" + userId +
                ", imgUrl='" + imgUrl + '\'' +
                ", imgDesc='" + imgDesc + '\'' +
                '}';
    }
}
