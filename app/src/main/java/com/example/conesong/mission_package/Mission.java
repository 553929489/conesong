package com.example.conesong.mission_package;

public class Mission {
    private int shop_image;
    private String shop_name;
    private int food_image;
    private String food_name;
    private String total;
    private String getMoney_text;
    private String RMB_image;
    private String getMoney;
    Mission(int shop_image,String shop_name,int food_image,String food_name,String total,String getMoney_text,String RMB_image,String getMoney){
        this.shop_image = shop_image;
        this.shop_name = shop_name;
        this.food_image= food_image;
        this.food_name = food_name;
        this.total = total;
        this.getMoney_text = getMoney_text;
        this.RMB_image = RMB_image;
        this.getMoney = getMoney;

    }

    public int getShop_image() {
        return shop_image;
    }

    public void setShop_image(int shop_image) {
        this.shop_image = shop_image;
    }

    public String getShop_name() {
        return shop_name;
    }

    public void setShop_name(String shop_name) {
        this.shop_name = shop_name;
    }

    public int getFood_image() {
        return food_image;
    }

    public void setFood_image(int food_image) {
        this.food_image = food_image;
    }

    public String getFood_name() {
        return food_name;
    }

    public void setFood_name(String food_name) {
        this.food_name = food_name;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getGetMoney_text() {
        return getMoney_text;
    }

    public void setGetMoney_text(String getMoney_text) {
        this.getMoney_text = getMoney_text;
    }

    public String getRMB_image() {
        return RMB_image;
    }

    public void setRMB_image(String RMB_image) {
        this.RMB_image = RMB_image;
    }

    public String getGetMoney() {
        return getMoney;
    }

    public void setGetMoney(String getMoney) {
        this.getMoney = getMoney;
    }


}
