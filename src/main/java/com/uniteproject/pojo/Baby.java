package com.uniteproject.pojo;

public class Baby {

    private int babyId;
    //宝宝的简介
    private String babyDesc;
    //宝宝头像
    private String head;
    //宝宝的s身高
    private int heright;
    //宝宝的体重
    private int weight;
    //宝宝的账号id
    private int userId;

    public int getBabyId() {
        return babyId;
    }

    public void setBabyId(int babyId) {
        this.babyId = babyId;
    }

    public String getBabyDesc() {
        return babyDesc;
    }

    public void setBabyDesc(String babyDesc) {
        this.babyDesc = babyDesc;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public int getHeright() {
        return heright;
    }

    public void setHeright(int heright) {
        this.heright = heright;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Baby{" +
                "babyId=" + babyId +
                ", babyDesc='" + babyDesc + '\'' +
                ", head='" + head + '\'' +
                ", heright=" + heright +
                ", weight=" + weight +
                ", userId=" + userId +
                '}';
    }
}
