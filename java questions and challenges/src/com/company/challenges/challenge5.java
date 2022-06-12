package com.company.challenges;

import java.util.Scanner;
//RESIZING AN ARRAY
public class challenge5 {
    private static Scanner scanner = new Scanner(System.in);
    private static int [] baseData = new int[10];

    public static void main(String[] args) {
        System.out.println("Enter 10 integers");
        getInput();
        printArray(baseData);
       resizeArray();
      //  System.out.println("Enter 12 integers array");
      //  getInput();
      //  printArray(baseData); do you know you can add extra array by doing this
        baseData[11] = 23;
        baseData[12] = 44;
        baseData[13] = 87;
        printArray(baseData);
    }

    private static void getInput(){
        for (int i = 0; i < baseData.length; i++)
            baseData[i] = scanner.nextInt();
    }
    private static void printArray(int [] array){
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }
    private static void resizeArray(){
        int [] original = baseData;

        baseData = new int[14];
        for (int i = 0; i < original.length; i++)
            original[i] = baseData[i];
    }

}
