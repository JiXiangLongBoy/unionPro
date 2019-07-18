package com.uniteproject.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModelProperty;

public class User {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @ApiModelProperty("登录用户名")
    private String username;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @ApiModelProperty("登录密码")
    private String password;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @ApiModelProperty("用户的邮箱")
    private String email;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @ApiModelProperty("用户的手机号")
    private String phone;





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
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
