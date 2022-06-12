package com.company;

import java.util.*;

public class ClubDoings {

    public static void calc(List<?> list) { //UNBOUNDED

            System.out.println(list);

    }

    private static Double add(ArrayList<? extends Number> num) { //BOUNDED

        double sum = 0.0;

        for (Number n : num) {
            sum = sum + n.doubleValue();
        }

        return sum;
    }

    public static void main(String[] args) {
        List<String> purchases = new ArrayList<String>();
       purchases.add("2 Champagne");
       purchases.add("4 Hennesy");
       purchases.add("10 Cokes");
       purchases.add("5 water");

       calc(purchases);

ArrayList<Double> prices = new ArrayList<>();
prices.add(4000.0);
prices.add(12000.0);
prices.add(1000.0);
prices.add(250.0);

        System.out.println("Your total price is " +add(prices));
    }
}