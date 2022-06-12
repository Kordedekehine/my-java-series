package com.company.assignments;

import java.util.Scanner;

public class Fourteen {
    public static void main(String[] args) {

        System.out.println(" Voters Confirmation");
        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.println("Enter age");
        num = scanner.nextInt();

        if (num >= 18){
            System.out.println("Eligible to vote!");
        }else if (num < 18){
            System.out.println("NOT ELIGIBLE! Maybe another year");
        }
    }
}
