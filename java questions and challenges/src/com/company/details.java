package com.company;

import java.time.LocalDate;
import java.util.Scanner;

public class details {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name ?");

        String userName = scanner.nextLine();
        System.out.println("Hello " + userName);

        System.out.println("How Old are you");
        int age = scanner.nextInt();
        int Year = LocalDate.now().minusYears(age).getYear();
        System.out.println("You were born in " + Year);

        if (age < 18 ){
            System.out.println("You are not an Adult (:");
        }else if (age > 18){
            System.out.println("You are an Adult ):");
        }
    }
}
