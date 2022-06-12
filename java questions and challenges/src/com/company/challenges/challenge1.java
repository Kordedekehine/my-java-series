package com.company.challenges;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class challenge1 {

  private static  Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myInteger = getIntegers(6);
      printArray(myInteger);
      sortIntegers(myInteger);
    }

  public static int[] getIntegers(int numbers){
      System.out.println("Enter " + numbers + " integers values .\r");
      int[] values = new int[numbers];

      for (int i = 0; i < values.length; i++){
          values[i] = scanner.nextInt();
      }
      return values;
  }

  public static void printArray(int[] values){
      for (int i = 0; i < values.length; i++){
          System.out.println(" element " + i + " = " + values[i]);
      }
  }

  public static void sortIntegers(int[] values) {
      int[] sortedArray = new int[values.length];
      for (int i = 0; i < values.length; i++) {

          Arrays.sort(sortedArray);
          sortedArray[i] = values[i];
          System.out.println(sortedArray[i]);
     }

  }

}
