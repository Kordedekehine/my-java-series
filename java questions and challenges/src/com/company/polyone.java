package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class polyone {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//   int [] a = new int[10];
//
//        System.out.println("Enter the ten numbers");
//
//   boolean present = false;
//   for (int i = 0; i < a.length; i++){
//       a[i] = scanner.nextInt();
//   }
//        System.out.println("please enter the number you wanna check ");
//   int number = scanner.nextInt();
//        for (int j:a) {
//         if(j == number){
//             present = true;
//         }
//            System.out.println(present);
//        }

        //Take 20 integers inputs from the user and print the following: 1. positive numbers 2.negative numbers 3.odd numbers 4.even numbers 5.0s number
//        int [] numbers = new int[20];
//        int pos = 0;
//        int neg = 0;
//        int odd = 0;
//        int even = 0;
//        int zero = 0;
//
//        System.out.println("Enter the 20 numbers you wanna test");
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println("print the value of numbers[ " + i + " ]");
//
//            numbers[i] = scanner.nextInt();
//
//            if (numbers[i] > 0) {
//                pos++;
//            } else if (numbers[i] < 0) {
//                neg++;
//            } else if (numbers[i] == 0){
//                zero++;
//            }
//            if (numbers[i] % 2 == 0) {
//                even++;
//            } else if (numbers[i] % 2 != 0) {
//                odd++;
//            }
//        }
//
//            System.out.println("Positive: " +pos + " Negative: " + neg + " Zero: " + zero + " Even " + even + " Odd " +odd);
//

        //take 10 integers and copy all the elements to another array and put them in reverse order

        int [] b = new int[10];
        int [] c = new int[10];

        for (int i = 0; i < b.length; i++){
            b[i] = scanner.nextInt();
        }
        int j = 0;
        for (int i = c.length-1; i >= 0; i--){
            c[i] = b[j];
        }
        for (int i = 0; i < c.length; i++){
            System.out.println("The value of b[" +i+ "] is " +b [i]);
        }
    }
}
