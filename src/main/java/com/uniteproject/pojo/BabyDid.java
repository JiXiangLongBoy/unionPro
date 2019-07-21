package com.uniteproject.pojo;

public class BabyDid {

    //宝宝成就表
    private int id;
    private String didTitle;
    private String didDesc;
    private String didImg;
    private int userId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDidTitle() {
        return didTitle;
    }

    public void setDidTitle(String didTitle) {
        this.didTitle = didTitle;
    }

    public String getDidDesc() {
        return didDesc;
    }

    public void setDidDesc(String didDesc) {
        this.didDesc = didDesc;
    }

    public String getDidImg() {
        return didImg;
    }

    public void setDidImg(String didImg) {
        this.didImg = didImg;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "BabyDid{" +
                "id=" + id +
                ", didTitle='" + didTitle + '\'' +
                ", didDesc='" + didDesc + '\'' +
                ", didImg='" + didImg + '\'' +
                ", userId=" + userId +
                '}';
    }
}
