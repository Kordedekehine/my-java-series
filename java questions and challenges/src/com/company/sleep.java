package com.company;
import java.util.Scanner;
public class sleep {
    public static void main(String[] args) {
    /*    multNums(567);
    }
    static boolean multNums(int m) {
        for (int num = 0; num <= 12; num++) {
            System.out.println(m + " * " + num + " = " + m * num);


        }
        System.out.println(" ");
        return false; */
        //write a program that prompts the user to input a positive integer. it should then print the multiplication table of that number.
        Scanner console = new Scanner(System.in);
        int num;

        System.out.print("Enter any positive integer: " );
        num = console.nextInt();

        System.out.println("Multiplication table of " +num);

        for (int i = 1; i <= 10; i++){
            System.out.println(num + " x " + i + " = " + (num*i));
        }
        

    }
}
