package com.company;

import java.util.Scanner;

public class Reddish {
   private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int [] myIntegers = getIntegers(6);
    }

    public static int [] getIntegers(int capacity){
        int [] array = new int [capacity];
        System.out.println("Enter " + capacity + " integer values: \r");
        for (int i = 0; i < array.length; i++){
          array[i] = scanner.nextInt();
        }
        return array;
    }
    public static void printArray(int [] array){
        for (int i = 0; i < array.length; i++){
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int [] sortIntegers(int [] array){
        int [] sortedArrays = new int[array.length];
        for (int i = 0; i < array.length; i++){
            sortedArrays[i] = array[i];
        }
        return sortedArrays;
    }

}