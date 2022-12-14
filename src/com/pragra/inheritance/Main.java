package com.pragra.inheritance;

public class Main {
    public static void main(String[] args) {
        CurrentAccount currentAccount=new CurrentAccount("ACC45SAN71000",
                100,true,true);
        System.out.println(currentAccount.accountNumber);
        System.out.println(currentAccount);



    }
}
