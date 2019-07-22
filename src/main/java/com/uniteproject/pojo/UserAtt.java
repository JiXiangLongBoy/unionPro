package com.uniteproject.pojo;


import io.swagger.annotations.ApiModelProperty;


public class UserAtt {
    @ApiModelProperty("被关注用户id")
    private Integer addUserAttId;
    @ApiModelProperty("被关注人动态")
    private String userDyn;
    @ApiModelProperty("发布动态时间")
    private String dynTime;
    @ApiModelProperty("被关注人宝宝信息")
    private String userBabyDyn;

    @ApiModelProperty("被关注人名字")
    private String userName;

    @Override
    public String toString() {
        return "UserAtt{" +
                "addUserAttId=" + addUserAttId +
                ", userDyn='" + userDyn + '\'' +
                ", dynTime='" + dynTime + '\'' +
                ", userBabyDyn='" + userBabyDyn + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAddUserAttId() {
        return addUserAttId;
    }

    public void setAddUserAttId(Integer addUserAttId) {
        this.addUserAttId = addUserAttId;
    }

    public String getUserDyn() {
        return userDyn;
    }

    public void setUserDyn(String userDyn) {
        this.userDyn = userDyn;
    }

    public String getDynTime() {
        return dynTime;
    }

    public void setDynTime(String dynTime) {
        this.dynTime = dynTime;
    }

    public String getUserBabyDyn() {
        return userBabyDyn;
    }

    public void setUserBabyDyn(String userBabyDyn) {
        this.userBabyDyn = userBabyDyn;
    }
}
