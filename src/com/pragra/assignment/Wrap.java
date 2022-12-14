package com.pragra.assignment;

public class Wrap implements TimsConsumable{
    String item="Wrap";
    double price=3.5;

    @Override
    public String toString() {
        return "Wrap{" +
                "item='" + item + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public double getPrice() {
        return 3.5;
    }

    @Override
    public String placeOrder() {
        return "Your order has been placed";
    }

    @Override
    public int getCalories() {
        return 15;
    }
}
