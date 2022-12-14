package com.pragra.assignment;

public class Bagel implements TimsConsumable{
    String item="Bagel";
    double price=2.1;

    @Override
    public String toString() {
        return "Bagel{" +
                "item='" + item + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public double getPrice() {
        return 2.1;
    }

    @Override
    public String placeOrder() {
        return "Your order has been placed";
    }

    @Override
    public int getCalories() {
        return 13;
    }
}
