package com.company.assignment;

import java.util.Scanner;

public class Ass1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 0;

        System.out.println("Enter integer for multiplication");
        num = scanner.nextInt();

        for (int i = 0; i < 13; i++){
            System.out.println(num + " * " + i + " = " + num * i);
        }
    }


}
