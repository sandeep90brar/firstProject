package com.pragra.assignment;

public class HockeyCards implements TimsMerchandise {
    String item="Hockey Card";
    double price=20;

    @Override
    public String toString() {
        return "HockeyCards{" +
                "item='" + item + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public String getFeature() {
        return "trading card that has the name of Wayne Douglas Gretzky";
    }

    @Override
    public double getPrice() {
        return 20;
    }
    @Override
    public String order() {
        return "Your order has been placed";
    }
}