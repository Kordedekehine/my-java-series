package com.company.assignments.assignments;

import java.util.Scanner;

public class Fifteen {

    public static void main(String[] args) {

        System.out.println(" ENTER YOUR SCORE TO CHECK YOUR GRADE");

        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.println("Input your score");
        num = scanner.nextInt();

        System.out.println("Your score is >>>>");

        if (num <= 40){
            System.out.println("Sorry Blockhead! You Failed! FF");
        }else if (num >= 41 && num <= 50){
            System.out.println("DD");
        }else if (num >= 51 && num <= 60){
            System.out.println("CC");
        }else if (num >= 61 && num <= 70){
            System.out.println("BC");
        }else if (num >= 71 && num <= 80){
            System.out.println("BB");
        }else if (num >= 81 && num <= 90){
            System.out.println("AB");
        }else if (num >= 91 && num <= 100){
            System.out.println("AA");
        }
    }
}
