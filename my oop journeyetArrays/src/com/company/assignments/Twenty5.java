package com.company.assignments;

import java.util.Scanner;

public class Twenty5 {
    public static void main(String[] args) {
        int n;
        float product = 1;
        int count = 1;
        float far = 0;
        float average = 0;
        float sum = 0;
        String end = "q";

        System.out.println("Enter the amount of numbers you want to input");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        while (count <= n) {
            System.out.println("Enter the " + count + "number?");
            far = scanner.nextInt();
            sum += far;
            ++count;
        }


        System.out.println("Enter q to calculate");
        end = scanner.next("q");



            average = sum / n;
            System.out.println("The average is " + average);

            product = sum * n;
            System.out.println("The product is " + product);

    }

}



