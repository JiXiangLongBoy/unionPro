package com.uniteproject.pojo;

/**
 * 菜谱
 */
public class Recipe {

    private int id;
    private String recipeName;
    private String recipeDesc;
    private int periodId;
    private int periodName;
    private String recipeText;
    private String recipeImgUrl;


    public String getRecipeImgUrl() {
        return recipeImgUrl;
    }

    public void setRecipeImgUrl(String recipeImgUrl) {
        this.recipeImgUrl = recipeImgUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public String getRecipeDesc() {
        return recipeDesc;
    }

    public void setRecipeDesc(String recipeDesc) {
        this.recipeDesc = recipeDesc;
    }

    public int getPeriodId() {
        return periodId;
    }

    public void setPeriodId(int periodId) {
        this.periodId = periodId;
    }

    public int getPeriodName() {
        return periodName;
    }

    public void setPeriodName(int periodName) {
        this.periodName = periodName;
    }

    public String getRecipeText() {
        return recipeText;
    }

    public void setRecipeText(String recipeText) {
        this.recipeText = recipeText;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "id=" + id +
                ", recipeName='" + recipeName + '\'' +
                ", recipeDesc='" + recipeDesc + '\'' +
                ", periodId=" + periodId +
                ", periodName=" + periodName +
                ", recipeText='" + recipeText + '\'' +
                ", recipeImgUrl='" + recipeImgUrl + '\'' +
                '}';
    }
}
