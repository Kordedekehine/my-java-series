package com.company.assignments;

import java.util.Scanner;

public class Twenty4 {
    public static void main(String[] args) {
        System.out.println("Enter a Year");
        int Year;
   Scanner scanner = new Scanner(System.in);
   Year = scanner.nextInt();


   if (Year % 100 == 0 && Year % 400 == 0){
       System.out.println("Wow! Its a leap Year");
   }else if (Year % 4 == 0){
       System.out.println("Wow! Its a leap Year");
   }else
       System.out.println("Its a normal Year");



    }
}