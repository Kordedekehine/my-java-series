package com.company.assignments;

import java.util.Scanner;

public class Ten {

    public static void main(String[] args) {
          int n = 0;
          float product = 1;
          int count = 1;
          float far = 0;
          float average = 0;
          float sum = 0;

        System.out.println("Enter the amount of numbers you want to input");
        Scanner scanner = new Scanner(System.in);
  n = scanner.nextInt();

  while (count <= n){
            System.out.println("Enter the " +count + "number?");
            far = scanner.nextInt();
            sum += far;
            ++count;
        }
        average = sum/n;
        System.out.println("The average is " +average);

    }
}