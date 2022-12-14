package com.pragra.inheritance;

public class Account {
    String accountNumber;
    double accountBalance;

    public Account(String accountNumber, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    public void totalBalance(){
        System.out.println("Balance in the account is $100,000");
    }
    public void totalDeposit(){
        System.out.println("you can deposit the money in this account");
    }


}
