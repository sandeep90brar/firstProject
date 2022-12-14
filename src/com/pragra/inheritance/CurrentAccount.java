package com.pragra.inheritance;

public class CurrentAccount extends Account{
    boolean cashBack;
    boolean netTransfer;

    public CurrentAccount(String accountNumber, double accountBalance,
                          boolean cashBack, boolean netTransfer) {
        super(accountNumber, accountBalance);
        this.cashBack = cashBack;
        this.netTransfer = netTransfer;
    }

    public void allowCashBack(){
        System.out.println("If you purchase a mobile phone... get 10% cashback");
    }
    public void transferMoney(){
        System.out.println("you can transfer money online");
    }

    @Override
    public String toString() {
        return "CurrentAccount{" +
                "cashBack=" + cashBack +
                ", netTransfer=" + netTransfer +
                ", accountNumber='" + accountNumber + '\'' +
                ", accountBalance=" + accountBalance +
                '}';
    }
}
