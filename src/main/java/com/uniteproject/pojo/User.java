package com.uniteproject.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModelProperty;

public class User {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @ApiModelProperty("登录用户名")
    private String username;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonIgnore//标记在属性或者方法上，返回的json数据即不包含该属性
    @ApiModelProperty("登录密码")
    private String password;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonIgnore//标记在属性或者方法上，返回的json数据即不包含该属性
    @ApiModelProperty("用户的邮箱")
    private String email;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonIgnore//标记在属性或者方法上，返回的json数据即不包含该属性
    @ApiModelProperty("用户的手机号")
    private String phone;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @ApiModelProperty("用户的头像")
    private String headImg;

    private String userDesc;
    private String userMonicker;
    @ApiModelProperty(value = "用户的id",example = "0")
    private int userAttention;
    @ApiModelProperty(value = "用户的粉丝数量",example = "0")
    private int userFans;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @ApiModelProperty(value = "用户的id",example = "0")
    private int id;


    public String getUserDesc() {
        return userDesc;
    }

    public void setUserDesc(String userDesc) {
        this.userDesc = userDesc;
    }

    public String getUserMonicker() {
        return userMonicker;
    }

    public void setUserMonicker(String userMonicker) {
        this.userMonicker = userMonicker;
    }

    public int getUserAttention() {
        return userAttention;
    }

    public void setUserAttention(int userAttention) {
        this.userAttention = userAttention;
    }

    public int getUserFans() {
        return userFans;
    }

    public void setUserFans(int userFans) {
        this.userFans = userFans;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", headImg='" + headImg + '\'' +
                ", userDesc='" + userDesc + '\'' +
                ", userMonicker='" + userMonicker + '\'' +
                ", userAttention=" + userAttention +
                ", userFans=" + userFans +
                ", id=" + id +
                '}';
    }
}
