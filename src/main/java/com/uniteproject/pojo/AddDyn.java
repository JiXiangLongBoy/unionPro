package com.uniteproject.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.models.auth.In;

public class AddDyn {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer addDynId;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer userId;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer addUserAttId;

    @Override
    public String toString() {
        return "AddDyn{" +
                "addDynId=" + addDynId +
                ", userId=" + userId +
                ", addUserAttId=" + addUserAttId +
                '}';
    }

    public Integer getAddDynId() {
        return addDynId;
    }

    public void setAddDynId(Integer addDynId) {
        this.addDynId = addDynId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getAddUserAttId() {
        return addUserAttId;
    }

    public void setAddUserAttId(Integer addUserAttId) {
        this.addUserAttId = addUserAttId;
    }
}
