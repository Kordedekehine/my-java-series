package com.company.challenges;

import java.util.Scanner;

//scanner of descending order
public class challenge4 {
    private  static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int [] myIntegers = getIntegers(5);
        int [] sorted = sortIntegers(myIntegers);
        printArray(sorted);
    }

    public static int [] getIntegers(int capacity){
        int [] array = new int [capacity];
        System.out.println("Enter the " + capacity + " integers value\r");
        for (int i = 0; i < array.length; i++){
           array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int [] array){
        for (int i = 0; i < array.length; i++){
            System.out.println("Elements " + i + " contents " + array[i]);
        }
    }
    public static int [] sortIntegers(int [] array){
        int [] sortedArray = new int[array.length]; //we put our sorted array to same capacity as our passed array
        for (int i = 0; i < array.length; i++){
            sortedArray[i] = array[i]; //we copy the array passed to our sorted array
        }
        int temp = 0;
        for (int i = 0; i < sortedArray.length; i++){
            for (int j = 0; j < sortedArray.length; i++){
                if (sortedArray[i] < sortedArray[j]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[j];
                    sortedArray[j] = temp;
                }
            }

        }
        return sortedArray;
    }
}
