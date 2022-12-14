package com.pragra.assignment;

public class CoffeePowder implements TimsMerchandise{
    String item="Coffee Powder";
    double price=10;

    @Override
    public String toString() {
        return "CoffeePowder{" +
                "item='" + item + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public String getFeature() {
        return "Dry, processed coffee that Enhance brain function ,Boost metabolism" ;

    }

    @Override
    public double getPrice() {

        return 10;
    }
    @Override
    public String order() {
        return "Your order has been placed";
    }
}
