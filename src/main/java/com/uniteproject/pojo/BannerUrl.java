package com.uniteproject.pojo;

public class BannerUrl {

    private String bannerUrl01;
    private String bannerUrl02;
    private String bannerUrl03;
    private String bannerUrl04;

    public String getBannerUrl01() {
        return bannerUrl01;
    }

    public void setBannerUrl01(String bannerUrl01) {
        this.bannerUrl01 = bannerUrl01;
    }

    public String getBannerUrl02() {
        return bannerUrl02;
    }

    public void setBannerUrl02(String bannerUrl02) {
        this.bannerUrl02 = bannerUrl02;
    }

    public String getBannerUrl03() {
        return bannerUrl03;
    }

    public void setBannerUrl03(String bannerUrl03) {
        this.bannerUrl03 = bannerUrl03;
    }

    public String getBannerUrl04() {
        return bannerUrl04;
    }

    public void setBannerUrl04(String bannerUrl04) {
        this.bannerUrl04 = bannerUrl04;
    }



    @Override
    public String toString() {
        return "BannerUrl{" +
                "bannerUrl01='" + bannerUrl01 + '\'' +
                ", bannerUrl02='" + bannerUrl02 + '\'' +
                ", bannerUrl03='" + bannerUrl03 + '\'' +
                ", bannerUrl04='" + bannerUrl04 + '\'' +
                '}';
    }
}
