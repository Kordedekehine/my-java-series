package com.company;

import java.util.Scanner;

public class arrays {

  private static   Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        int[] myInteger = getIntegers(5);
//        for (int i = 0; i < myInteger.length; i++){
//            System.out.println("Element " + i + " typed value was " +myInteger[i]);
//        }
//        System.out.println(("average is " +getAveravge(myInteger)));

        int[] Integers = MultiplyInteger(3);
        for (int i = 0; i < Integers.length; i++){
            System.out.println("The multiplication of the elements are " +i +" . " +Integers[i] * i);
        }

    }
//    public static int[] getIntegers(int numbers){
//        System.out.println("Enter " + numbers + " integer values.\r");
//        int[] values = new int[numbers];
//
//        for (int i = 0; i < values.length; i++){
//            values[i] = scanner.nextInt();
//        }
//        return values;
//}
//
//  public static double getAveravge(int[] Array){
//        int sum = 0;
//        for (int i = 0; i < Array.length; i++){
//            sum += Array.length;
//        }
//        return (double) sum / (double) Array.length;
//  }

  public static int[] MultiplyInteger(int number){
      System.out.println("Enter " +number + " Integer value \r");
      int[] multiples = new int[number];

      for (int i =0; i <multiples.length; i++){
          multiples[i] = scanner.nextInt();
      }
      return multiples;
  }
}
