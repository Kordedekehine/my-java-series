package com.company;

import java.util.Scanner;

public class Test {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
      int [] myInteger = getIntegers(3);
      int [] sorted = sortIntegers(myInteger);
      printArray(sorted);
    }

    public static int [] getIntegers(int input){
        System.out.println("Enter " + input + " integer values");
        int [] saver = new int[input];

        for (int i = 0; i < saver.length; i++){
            saver[i] = scanner.nextInt();
        }
        return saver;
    }

    public static void printArray(int [] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Biggest number no " + i + " is " + array[i]);
        }
    }

        public static int [] sortIntegers(int [] input){
         int [] saver = new int [input.length];

         for (int i = 0; i < saver.length; i++){
             saver[i] = input[i];
        }

         int temp;
         for (int i = 0; i < saver.length; i++){
             for (int j = i + 1; j < saver.length; j++){
                 if (saver[i] < saver[j]){
                     temp = saver[i];
                     saver[i] = saver[j];
                     saver[j] = temp;
                 }
             }
         }
         return saver;
    }



}