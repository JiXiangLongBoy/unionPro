package com.uniteproject.pojo;

import io.swagger.annotations.ApiModelProperty;


public class Community {
    @ApiModelProperty("社区动态Id")
    private int communityId;
    @ApiModelProperty("用户Id")
    private int userId;
    @ApiModelProperty("社区动态类型Id")
    private int comTypeId;
    @ApiModelProperty("动态内容")
    private String communityDesc;

    @ApiModelProperty("动态内容")
    private String userName;
    @ApiModelProperty("动态内容")
    private String headImg;

    @Override
    public String toString() {
        return "Community{" +
                "communityId=" + communityId +
                ", userId=" + userId +
                ", comTypeId=" + comTypeId +
                ", communityDesc='" + communityDesc + '\'' +
                ", userName='" + userName + '\'' +
                ", headImg='" + headImg + '\'' +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    public int getCommunityId() {
        return communityId;
    }

    public void setCommunityId(int communityId) {
        this.communityId = communityId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getComTypeId() {
        return comTypeId;
    }

    public void setComTypeId(int comTypeId) {
        this.comTypeId = comTypeId;
    }

    public String getCommunityDesc() {
        return communityDesc;
    }

    public void setCommunityDesc(String communityDesc) {
        this.communityDesc = communityDesc;
    }


}
