package com.uniteproject.pojo;

import io.swagger.annotations.ApiModelProperty;

public class ComType {
    @ApiModelProperty("社区动态类型Id")
    private int comTypeId;
    @ApiModelProperty("社区动态类型名称")
    private String comName;

    @Override
    public String toString() {
        return "ComType{" +
                "comTypeId=" + comTypeId +
                ", comName='" + comName + '\'' +
                '}';
    }

    public int getComTypeId() {
        return comTypeId;
    }

    public void setComTypeId(int comTypeId) {
        this.comTypeId = comTypeId;
    }

    public String getComName() {
        return comName;
    }

    public void setComName(String comName) {
        this.comName = comName;
    }
}
