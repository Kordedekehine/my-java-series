package com.company.assignment;

import java.util.Scanner;

public class Ass5 {
    public static void main(String[] args) {
int num = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter A number to know its day in a week");
        num = scanner.nextInt();

        if (num == 1){
            System.out.println("Sunday");
        }else if (num == 2){
            System.out.println("Monday");
        }else if (num == 3){
            System.out.println("Tuesday");
        }else if (num == 4){
            System.out.println("Wednesday");
        }else if (num == 5){
            System.out.println("Thursday");
        }else if (num == 6){
            System.out.println("Friday");
        }else if (num == 7){
            System.out.println("Saturday");
        }else
            System.out.println("Not among the 7 days in the week");


    }
}