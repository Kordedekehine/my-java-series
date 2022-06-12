package com.company.calculator;

import java.util.Scanner;

public class CalcApp {
    public static void main(String[] args) {
        CalcApp calcApp = new CalcApp();
        char Exit_Status;
        do {
            System.out.println("CALCULATE YOUR FIGURES: |DIVIDE|ADD|MULTIPLY|SUBTRACT|REMAINDER");
            Scanner scanner = new Scanner(System.in);
            System.out.println("PRESS: A-ADD|D-DIVIDE|M-MULTIPLY|S-SUBTRACT|R-REMAINDER");
            char option = scanner.next().charAt(0);
            {
                double a;
                double b;
                if (option == 'A') {
                    System.out.println("Enter the first number");
                    a = scanner.nextDouble();

                    System.out.println("Enter the second number");
                    b = scanner.nextDouble();

                    double ans = a + b;
                    System.out.println("Addition = " + ans);

                } else if (option == 'D') {
                    System.out.println("Enter the first number");
                    a = scanner.nextDouble();

                    System.out.println("Enter the second number");
                    b = scanner.nextDouble();

                    double ans = a / b;
                    System.out.println("Division = " + ans);

                } else if (option == 'M') {
                    System.out.println("Enter the first number");
                    a = scanner.nextDouble();

                    System.out.println("Enter the second number");
                    b = scanner.nextDouble();

                    double ans = a * b;
                    System.out.println("Multiplication = " + ans);

                } else if (option == 'S') {
                    System.out.println("Enter the first number");
                    a = scanner.nextDouble();

                    System.out.println("Enter the second number");
                    b = scanner.nextDouble();

                    double ans = a - b;
                    System.out.println("Subtraction = " + ans);

                } else if (option == 'R') {
                    System.out.println("Enter the first number");
                    a = scanner.nextDouble();

                    System.out.println("Enter the second number");
                    b = scanner.nextDouble();

                    double ans = a % b;
                    System.out.println("Remainder = " + ans);

                } else
                    System.out.println("Press Q to quit or C to continue");
            }
            Exit_Status = scanner.next().charAt(0);
        }
        while (Exit_Status == 'C');
    }
}