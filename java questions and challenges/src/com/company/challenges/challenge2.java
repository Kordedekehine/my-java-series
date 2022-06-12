package com.company.challenges;

import java.util.Arrays;
import java.util.Scanner;

public class challenge2 {

//    private static Scanner scanner = new Scanner(System.in);
//
//    public static void main(String[] args) {
//     int [] myInteger = collectIntegers(10);
//     getInteger(myInteger);
//     sortInteger(myInteger);
//
//    }
//        public static int[] collectIntegers ( int numbers){
//
//            System.out.println("Enter " + numbers + " integer values \r");
//            int[] arrays = new int[numbers];
//
//            for (int i = 0; i < arrays.length; i++) {
//                arrays[i] = scanner.nextInt();
//            }
//            return arrays;
//        }
//
//        public static void getInteger ( int[] arrays){
//            for (int i = 0; i < arrays.length; i++) {
//                System.out.println(arrays[i]);
//            }
//        }

    public static void main(String[] args) {
        int temp = 0;
        int[] arrays = new int[]{1, 23, 4, 7, 3, 62, 45, 77,};


        System.out.println("Elements of original array: ");
        for (int i = 0; i < arrays.length; i++) {
            System.out.println(arrays[i] + " ");
        }

        for (int i = 0; i < arrays.length; i++) {
            for (int j = i + 1; j < arrays.length; j++) {
                if (arrays[i] < arrays[j]) {
                    temp = arrays[i];
                    arrays[i] = arrays[j];
                    arrays[j] = temp;

                }
            }
        }
        System.out.println("Elements of array sorted in descending order: ");
        for (int i = 0; i < arrays.length; i++) {
            System.out.println(arrays[i]);
        }

        temp = 0;
        int[] array = new int[]{1, 23, 4, 7, 3, 62, 45, 77,};

        Arrays.sort(array);

        System.out.println("Elements of the array sorted");
       for (int i = 0; i < array.length; i++){
           System.out.println(array[i]);
       }

    }

}