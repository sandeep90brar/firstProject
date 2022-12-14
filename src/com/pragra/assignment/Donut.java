package com.pragra.assignment;

public class Donut implements TimsConsumable{
    String item="Donut";
    double price=1.8;

    @Override
    public String toString() {
        return "Donut{" +
                "item='" + item + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public double getPrice() {
        return 1.8;
    }

    @Override
    public String placeOrder() {
        return "Your order has been placed";
    }

    @Override
    public int getCalories() {
        return 10;
    }
}
