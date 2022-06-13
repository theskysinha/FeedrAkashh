package com.example.feedrapplication;

public class FoodObject {
    public String foodname, foodamount, fromUser;

    public FoodObject()
    {}

    public FoodObject(String foodname,String foodamount, String fromUser) {
        this.foodname = foodname;
        this.foodamount = foodamount;
        this.fromUser = fromUser;
    }
}
