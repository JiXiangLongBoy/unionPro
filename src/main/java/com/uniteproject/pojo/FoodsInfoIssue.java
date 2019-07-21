package com.uniteproject.pojo;

public class FoodsInfoIssue {

    private int id;
    private String ask;
    private String notice;
    private String answer;
    private int foodsInfoId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAsk() {
        return ask;
    }

    public void setAsk(String ask) {
        this.ask = ask;
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getFoodsInfoId() {
        return foodsInfoId;
    }

    public void setFoodsInfoId(int foodsInfoId) {
        this.foodsInfoId = foodsInfoId;
    }

    @Override
    public String toString() {
        return "FoodsInfoIssue{" +
                "id=" + id +
                ", ask='" + ask + '\'' +
                ", notice='" + notice + '\'' +
                ", answer='" + answer + '\'' +
                ", foodsInfoId=" + foodsInfoId +
                '}';
    }
}
