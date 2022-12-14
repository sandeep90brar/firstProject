package com.pragra.assignment;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DummyCheckout {
    long cardNumber, enteredCardNumber;
    int cvv, enteredCVV;
    String enteredDate;
    Calendar calendar=new GregorianCalendar(2021,07,30);
    int month = calendar.get(Calendar.MONTH);
    int year = calendar.get(Calendar.YEAR);

    String finalYear = String.valueOf(year).substring(2);

    String date=month+"/"+finalYear;
    void checkout() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 12 digit credit card number");
        enteredCardNumber = sc.nextLong();
        System.out.println("Please enter 3 digit CVV");
        enteredCVV = sc.nextInt();
        System.out.println("Please enter Month and Year in MM/YY format");
        enteredDate = sc.next();
        if (enteredCardNumber == 123456789987l && enteredCVV == 555 && enteredDate.equals(date)) {
            System.out.println("Payment Successful.");
            System.out.println("Thank you for choosing Tim!!!!!");
        } else {
            System.out.println("Payment failed.");
        }

    }
}
