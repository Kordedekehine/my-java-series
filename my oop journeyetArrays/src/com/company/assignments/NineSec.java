package com.company.assignments;

import java.util.Scanner;

public class NineSec {

    public static void reverseMethod(int number){
        if (number < 10){
            System.out.println(number);
            return;
        }
        else {
            System.out.println(number % 10);
            reverseMethod(number / 10);
        }
    }

    public static void main(String[] args) {
        int num = 0;

        System.out.println(" INPUT  : ");
        Scanner in = new Scanner(System.in);
        num = in.nextInt();

        System.out.println("OUTPUT :");
        reverseMethod(num);
        System.out.println(num);
    }
}
