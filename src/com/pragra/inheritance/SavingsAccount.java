package com.pragra.inheritance;

public class SavingsAccount extends Account{
    boolean serviceCharges=true;
    boolean minBalanceReq=true;

    public SavingsAccount(String accountNumber, double accountBalance, boolean serviceCharges,
                          boolean minBalanceReq) {
        super(accountNumber, accountBalance);
        this.serviceCharges = serviceCharges;
        this.minBalanceReq = minBalanceReq;
    }

    public void applyServiceCharges(){
        System.out.println("service charges are applied.......");
    }
    public void balanceReq(){
        System.out.println("$100 are required to open the account");
    }
}
