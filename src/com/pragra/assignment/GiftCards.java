package com.pragra.assignment;

public class GiftCards implements TimsMerchandise {
    String item="Gift card";
    double price=11;

    @Override
    public String toString() {
        return "GiftCards{" +
                "item='" + item + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public String getFeature() {
        return "$10 GIFT CARD that can be used to make purchases at TIM.";
    }

    @Override
    public double getPrice() {
        return 11;
    }

    @Override
    public String order() {
        return "Your order has been placed";
    }
}