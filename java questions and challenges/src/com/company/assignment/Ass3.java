package com.company.assignment;

import java.util.Scanner;

public class Ass3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        System.out.println("Enter Integer to check if positive or negative");
        num = scanner.nextInt();

        if(num > 0){
            System.out.println(num  + " Is a positive number");
        }else if (num < 0){
            System.out.println( num  + " Is a negative number");
        }

    }
}
