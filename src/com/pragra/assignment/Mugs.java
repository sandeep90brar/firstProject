package com.pragra.assignment;

public class Mugs implements TimsMerchandise {
    String item="Mug";
    double price=5;




    @Override
    public String toString() {
        return "Mugs{" +
                "item='" + item + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public String getFeature() {
        return "It is a beautiful RED MUG";
    }

    @Override
    public double getPrice() {

        return 5;
    }

    @Override
    public String order() {
        return "Your order has been placed";
    }
}
