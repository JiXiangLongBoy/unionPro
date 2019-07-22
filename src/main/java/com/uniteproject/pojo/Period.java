package com.uniteproject.pojo;

import io.swagger.annotations.ApiModelProperty;

public class Period {
    @ApiModelProperty(value = "",example = "0")
    private int id;
    private String periodName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPeriodName() {
        return periodName;
    }

    public void setPeriodName(String periodName) {
        this.periodName = periodName;
    }

    @Override
    public String toString() {
        return "Period{" +
                "id=" + id +
                ", periodName='" + periodName + '\'' +
                '}';
    }
}
