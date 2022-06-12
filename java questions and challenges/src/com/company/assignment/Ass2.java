package com.company.assignment;

import  java.lang.Math;
import java.util.Scanner;

//(financial application: compute the future investment value) Write a java method that computes future invest value at a given interest
//rate for a specified number of years....
//The input should be : investment amount:1000, interest rate: 10, number of years 5
//expected output should be: 1st to 5th year and their future value aside

public class Ass2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double investment_Amt, interest_Rate;

        System.out.println("Enter investmentAmount ");
        investment_Amt = scanner.nextDouble();

        System.out.println("Enter investmentRate ");
        interest_Rate = scanner.nextDouble();

        System.out.println("Enter number of years: ");
        int years = scanner.nextInt();
        for (int i = 1; i <= years; i++)
            System.out.printf(i + " year" + "   FutureInvestmentValue is %1.2f \n",
                    futureInvestmentValue(investment_Amt, interest_Rate, i ));
    }

    public static double futureInvestmentValue(double investment_Amt, double interest_Rate, int years) {
        return investment_Amt * Math.pow((1 + interest_Rate / 1200), (years * 12));
    }
}






