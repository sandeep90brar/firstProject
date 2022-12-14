package com.pragra.assignment;

public class Coffee implements TimsConsumable{
    String item="Coffee";
    double price=2.5;

    @Override
    public String toString() {
        return "Coffee{" +
                "item='" + item + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public double getPrice() {
        return 2.5;
    }

    @Override
    public String placeOrder() {
        return "Your order has been placed";
    }


    @Override
    public int getCalories() {
        return 20;
    }
}
