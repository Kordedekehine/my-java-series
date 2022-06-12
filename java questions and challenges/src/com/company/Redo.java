package com.company;

public class Redo {
   /* public static void main(String[] args) {
        double FirstMethod = CalcFeetAndInchesToCentimetre(6, 0);
        System.out.println(FirstMethod);
        double FeetInInches = CalcFeetAndInchesToCentimetre(12);
        System.out.println(FeetInInches);
    }

    static double CalcFeetAndInchesToCentimetre(double feet, double inches) {
        double centimeter = (feet * 12) * 2.54;
        centimeter += inches * 2.54;
        if ((feet <= 0) || (inches >= 0 || inches <= 12)) {
            System.out.println(feet + " feet, " + "inches " + inches + " = centimetre " + centimeter);
            return centimeter;

        } else
            return -1;
    }

    static double CalcFeetAndInchesToCentimetre(double inches) {
        double feet = 2.54;
        if (inches >= 0) {
            return inches / feet;
        } else
            return -1;
    } */
    //write a banking application that perform a following tasks..check balance,deposit, withdrawal,exit..
//the program should print an option on the first run..1 check balance 2 deposit 3 withdrawal 4 exit
//another page selects an operation to perform

    public static void main(String[] args) {
        BankApp(1);
    }

    static void BankApp(int Options) {
        if (Options == 1) {
            int balance = 2000;
            System.out.println("your acc balance is " +balance);
        } else if (Options == 2) {
            System.out.println("input how much you wanna deposit");
        } else if (Options == 3) {
            System.out.println("input how much you wanna withdraw");

        } else
            System.out.println("exit");

    }

   }
