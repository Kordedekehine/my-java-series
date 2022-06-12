package com.company.challenges;

import java.util.Arrays;
import java.util.Collections;

public class challenge {
    public static void main(String[] args) {
       Integer [] array = {24,64,2,75,83,79,68,54,78,};
       Arrays.sort(array, Collections.reverseOrder());
        System.out.println("Array elements in descending order: " +Arrays.toString(array));

        Arrays.sort(array); //in ascending order

        for (int i = 0; i < array.length; i++){
            System.out.println("in ascending order " +array[i].toString());
        }
   }

}
