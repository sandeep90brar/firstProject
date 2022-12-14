package com.pragra.inheritance;

public class PromotionalSavingAccount extends SavingsAccount{
    float promotionalRate;

    public PromotionalSavingAccount(String accountNumber, double accountBalance, boolean serviceCharges,
                                    boolean minBalanceReq, float promotionalRate) {
        super(accountNumber, accountBalance, serviceCharges, minBalanceReq);
        this.promotionalRate = promotionalRate;
    }

    public void promotedProduct(){
        System.out.println("*******iphone 14 gives you saving*******");
    }
}
