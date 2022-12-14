package com.pragra.day10;

public class Inheritance {
    public static void main(String[] args) {
        Bank bank;
        bank=new ScotiaBank();
        bank.rateOfInterest();
bank=new TDBank();
bank.rateOfInterest();
bank=new Bmo();
bank.rateOfInterest();

    }
}
