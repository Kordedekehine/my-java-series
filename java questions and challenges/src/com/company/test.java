package com.company;
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int base;
        int power;
        int result = 1;

        System.out.println("Enter the base number ");
        base = console.nextInt();

        System.out.println("Enter the power ");
        power = console.nextInt();

        for (int i = 1; i <= power; i++){
            result *= base;
        }
        System.out.println("Result : "+ result);
    }
}
