package com.pragra.assignment;

import java.util.Scanner;

public class TimsItems {
    public static void main(String[] args) {
        int choice, merchandiseChoice, consumableChoice, order, orderedItems = 0;
        double sum = 0;
        String arr[] = new String[100];
        String repeat;
        for (int i = 0; i <= arr.length; i++) {
            do {
                System.out.println("Please give your input");
                System.out.println("1. Tims Merchandise");
                System.out.println("2. Tims Consumable");
                System.out.println("3. Done Ordering");

                Scanner sc = new Scanner(System.in);
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("1. Mugs");
                        System.out.println("2. Coffee Powder");
                        System.out.println("3. Gift Cards");
                        System.out.println("4. Hockey Cards");
                        merchandiseChoice = sc.nextInt();
                        switch (merchandiseChoice) {
                            case 1:
                                Mugs mugs = new Mugs();
                                System.out.println("Price: $" + mugs.getPrice());
                                System.out.println("Features: " + mugs.getFeature());
                                System.out.println("1. Order this");

                                order = sc.nextInt();
                                if (order == 1) {
                                    System.out.println(mugs.order());

                                }
                                orderedItems++;
                                sum = sum + mugs.getPrice();
                                arr[0] = "Item:Mug   Price:" + mugs.getPrice();

                                break;
                            case 2:
                                CoffeePowder coffeePowder = new CoffeePowder();
                                System.out.println("Price: $" + coffeePowder.getPrice());
                                System.out.println("Features: " + coffeePowder.getFeature());
                                System.out.println("Press 1 to Order");
                                order = sc.nextInt();
                                if (order == 1) {
                                    System.out.println(coffeePowder.order());
                                }
                                orderedItems++;
                                sum = sum + coffeePowder.getPrice();
                                arr[1] = "Item:Coffee Powder   Price:" + coffeePowder.getPrice();
                                break;
                            case 3:
                                GiftCards giftCards = new GiftCards();
                                System.out.println("Price: $" + giftCards.getPrice());
                                System.out.println("Features: " + giftCards.getFeature());
                                System.out.println("Press 1 to Order");
                                order = sc.nextInt();
                                if (order == 1) {
                                    System.out.println(giftCards.order());
                                }
                                orderedItems++;
                                sum = sum + giftCards.getPrice();
                                arr[2] = "Item:Gift Card   Price:" + giftCards.getPrice();
                                break;
                            case 4:
                                HockeyCards hockeyCards = new HockeyCards();
                                System.out.println("Price: $" + hockeyCards.getPrice());
                                System.out.println("Features: " + hockeyCards.getFeature());
                                System.out.println("Press 1 to Order");
                                order = sc.nextInt();
                                if (order == 1) {
                                    System.out.println(hockeyCards.order());
                                }
                                orderedItems++;
                                sum = sum + hockeyCards.getPrice();
                                arr[3] = "Item:Hockey Card   Price:" + hockeyCards.getPrice();
                                break;
                            default:
                                System.out.println("Please select from above mentioned options");

                        }
                        break;
                    case 2:
                        System.out.println("1. Donut");
                        System.out.println("2. Bagel");
                        System.out.println("3. Coffee");
                        System.out.println("4. Wrap");
                        consumableChoice = sc.nextInt();
                        switch (consumableChoice) {
                            case 1:
                                Donut donut = new Donut();
                                System.out.println("Price: $" + donut.getPrice());
                                System.out.println("Total Calories: " + donut.getCalories());
                                System.out.println("Press 1 to Order");
                                order = sc.nextInt();
                                if (order == 1) {
                                    System.out.println(donut.placeOrder());
                                }
                                orderedItems++;
                                sum = sum + donut.getPrice();
                                arr[4] = "Item:Donut   Price:" + donut.getPrice();
                                break;
                            case 2:
                                Bagel bagel = new Bagel();
                                System.out.println("Price: $" + bagel.getPrice());
                                System.out.println("Total Calories: " + bagel.getCalories());
                                System.out.println("Press 1 to Order");
                                order = sc.nextInt();
                                if (order == 1) {
                                    System.out.println(bagel.placeOrder());
                                }
                                orderedItems++;
                                sum = sum + bagel.getPrice();
                                arr[5] = "Item:Bagel   Price:" + bagel.getPrice();
                                break;
                            case 3:
                                Coffee coffee = new Coffee();
                                System.out.println("Price: $" + coffee.getPrice());
                                System.out.println("Total Calories: " + coffee.getCalories());
                                System.out.println("Press 1 to Order");
                                order = sc.nextInt();
                                if (order == 1) {
                                    System.out.println(coffee.placeOrder());
                                }
                                orderedItems++;
                                sum = sum + coffee.getPrice();
                                arr[6] = "Item:Coffee   Price:" + coffee.getPrice();
                                break;
                            case 4:
                                Wrap wrap = new Wrap();
                                System.out.println("Price: $" + wrap.getPrice());
                                System.out.println("Total Calories: " + wrap.getCalories());
                                System.out.println("Press 1 to Order");
                                order = sc.nextInt();
                                if (order == 1) {
                                    System.out.println(wrap.placeOrder());
                                }
                                orderedItems++;
                                sum = sum + wrap.getPrice();
                                arr[7] = "Item:Wrap   Price:" + wrap.getPrice();
                                break;
                            default:
                                System.out.println("Please select from above mentioned options");
                                break;
                        }
                        break;
                    case 3:
                        System.out.println("1. Checkout");
                        System.out.println("2. Cancel Order");
                        order = sc.nextInt();
                        if (order == 1) {
                            System.out.println("Proceed to Checkout!!!!!");


                        } else if (order == 2) {
                            CancelOrder cancelOrder = new CancelOrder();
                            System.out.println(cancelOrder.orderCancel());

                        }
                }
                System.out.println("Do you want to order something else???? if yes press y, if not press n");
                repeat = sc.next();
                if (repeat.equals("y")) {
                    continue;
                } else {
                    break;
                }
            } while (repeat.equals("y"));

            System.out.println("**************************");
            System.out.println("Total Items Ordered: " + orderedItems);
            System.out.println("**************************");

            System.out.println(arr[i]);
            break;
        }
        System.out.println("**********************");
            System.out.println("Total amount: $" + sum);
            System.out.println("***************************");

            System.out.println("Proceed to checkout");
            System.out.println("### YOU SHOULD HAVE BALANCE OF $30 IN YOUR WALLET###");
            DummyCheckout dummyCheckout = new DummyCheckout();
            dummyCheckout.checkout();
            System.out.println();


        }
    }
