package com.company;

import java.util.Scanner;
import java.util.ArrayList;

public class Javatpoint  {;
    private static Scanner scanner = new Scanner(System.in);
    private static int [] baseData = new int[10];

    public static void main(String[] args) {
        System.out.println("Enter 10 integer values");
        getInput();
        descending();
     printArray(baseData);

//        System.out.println("Enter 12 integer values");
//     resizeArray();
//     getInput();
//     printArray(baseData);
//        System.out.println("in descending order");
//     descending(baseData);

    }

    public static void getInput(){
        for (int i =0; i < baseData.length; i++){
            baseData[i] = scanner.nextInt();
        }
    }

    public static void printArray(int [] array){
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i] + " ");
        }
    }

    public static void resizeArray(){
        int [] original = baseData;
        baseData = new int[12];

        for (int i = 0; i < original.length; i++){
            baseData[i] = original[i];
        }
    }

public static void descending(){
        int [] legible = baseData;

        for (int i = 0; i < legible.length; i++){
            legible[i] = baseData[i];
        }
        int temp;
        for (int i = 0; i < legible.length; i++){
            for (int j = i + 1; j < legible.length; j++){
                if (legible[i] < legible[j]){
                    temp = legible[i];
                    legible[i] = legible[j];
                    legible[j] = temp;
                }
            }
        }

    }






}














