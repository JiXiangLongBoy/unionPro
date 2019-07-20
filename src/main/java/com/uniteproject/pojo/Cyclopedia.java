package com.uniteproject.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModelProperty;

public class Cyclopedia {

    @ApiModelProperty("百科问答的Id值")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private int cycId;

    @ApiModelProperty("百科问答对应的用户id，用于收藏等功能")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private int userId;

    @ApiModelProperty("百科问答的标题")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String cycTitle;

    @ApiModelProperty("百科问答的描述")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String cycDesc;
    @ApiModelProperty("百科问答的类型")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String cycType;
    @ApiModelProperty("百科问答的在读人数")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private int number;
    @ApiModelProperty("百科问答的图片url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String imgUrl;


    public int getCycId() {
        return cycId;
    }

    public void setCycId(int cycId) {
        this.cycId = cycId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getCycTitle() {
        return cycTitle;
    }

    public void setCycTitle(String cycTitle) {
        this.cycTitle = cycTitle;
    }

    public String getCycDesc() {
        return cycDesc;
    }

    public void setCycDesc(String cycDesc) {
        this.cycDesc = cycDesc;
    }

    public String getCycType() {
        return cycType;
    }

    public void setCycType(String cycType) {
        this.cycType = cycType;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    @Override
    public String toString() {
        return "Cyclopedia{" +
                "cycId=" + cycId +
                ", userId=" + userId +
                ", cycTitle='" + cycTitle + '\'' +
                ", cycDesc='" + cycDesc + '\'' +
                ", cycType='" + cycType + '\'' +
                ", number=" + number +
                ", imgUrl='" + imgUrl + '\'' +
                '}';
    }
}
