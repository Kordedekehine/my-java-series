package com.company;

import java.util.Arrays;

public class rrays {
    public static void main(String[] args) {
        int[] nums = new int[5];
        nums[0] = 5;
        nums[1] = 8;
        nums[2] = 9;
        nums[3] = 11;
        nums[4] = 20;

        //  for (int i = 0; i < nums.length; i++){
        //      System.out.println(nums[i]);
        //   }
        for (int num : nums
        ) {
            System.out.println(num);
        }

        nums = new int[12];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;
        nums[4] = 5;
        nums[5] = 6;
        nums[6] = 7;
        nums[7] = 8;
        nums[8] = 9;
        nums[9] = 10;
        nums[10] = 11;
        nums[11] = 12;

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[1] + " * " + nums[i] + " = " + nums[1] * nums[i]);
        }

        //A man went to a vacation and brought a car of 2000 and a bunch of 500 and a ball of 300. write a program to calculate all
        //is expenses and the average money spent.

        int[] expense = {2000, 500, 300};
        int total = 0;
        double average1;

        for (int expenses :
                expense) {
            total += expenses;
            System.out.println("total of the amount is " + total);
        }

        int average1Lenght = expense.length;
        average1 = ((double) total / (double) average1Lenght);
        System.out.println("average = " + average1);

        //or
        int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
        int sum = 0;
        Double average;

        for (int number : numbers) {
            sum += number;
        }

        int arrayLength = numbers.length;

        //calculate the average
        //convert the average from int to double
        average = ((double) sum / (double) arrayLength);

        System.out.println("sum = " + sum);
        System.out.println("average = " + average);

        //Multi-dimensional array 2d array
        double[][] inputs = {{4, 5, 6, 7, 3, 45, 6}, {7, 3, 556, 3, 24, 6, 7}};
        int every = 0;

        System.out.println(inputs[0][6] + "\n" + inputs[1][2]);

        System.out.println("****************************************");
        //to print all 2d array
        int[][] a = {{1, -2, 3}, {-4, -5, 6, 9}, {7},};
        for (int i = 0; i < a.length; ++i) {  //for loop
            for (int j = 0; j < a[i].length; ++j) {
                System.out.println(a[i][j]);
            }
        }

        for (int[] innerArray : a) {   //foreach loop
            for (int data : innerArray) {
                System.out.println(data);
            }
        }

        //create a 3d array
        int[][][] test = {{{1, -2, 3}, {2, 3, 4}}, {{-4, -5, 6, 9}, {1}, {2, 3}}};
        for (int[][] array2D : test) {
            for (int[] array1D : array2D) {
                for (int item : array1D) {
                    System.out.println(item);
                }
            }
        }
        //COPYING OF ARRAYS
//        int [] figures = {1,2,3,4,5,6};
//        int [] positiveNumbers = figures; //copying array...not really ideal its called shallow copy
//
//        for (int figure: positiveNumbers) {
//            System.out.println(figure + " , ");
//        }
//        int[] source = {1, 2, 3, 4, 5, 6};
//        int[] destination = new int[6];
//        //iterate and copy elements from source to destination
//        for (int i = 0; i < source.length; ++i) {
//            destination[i] = source[i];
//        }
//        //converting array to string
//        System.out.println(Arrays.toString(source));
//
//        //Another way to copy array
//        int[] n1 = {2, 3, 12, 4, 12, -2};
//
//        int[] n3 = new int[5];
//
//         //creating n2 array of having length of n1 array
//        int[] n2 = new int[n1.length];
//
//        //copying entire n1 array to n2
//        System.arraycopy(n1, 0, n2, 0, n1.length);//entire elements from the n1 array are copied to n2 array
//        System.out.println("n2 = " + Arrays.toString(n2));
//
//        //copying elements from index 2 on n1 array
//        //copying element to index 1 of n3 array
//        //2 elements will be copied
//        System.arraycopy(n1, 2, n3, 1, 2); //elements of the n1 array starting from index 2 are copied to the index
//        //starting from 1 of the n3 array
//        System.out.println("n3 = " + Arrays.toString(n3));

        //Array copying using Arrays.copyOfRange
        int [] source = {2,3,12,4,12,-2};

        //copying entire source array to destination
        int[] destination1 = Arrays.copyOfRange(source,0,source.length);
        System.out.println("destination1 = " + Arrays.toString(destination1));

        //copying from index 2 to 5 (5 is not included)
        int[] destination2 = Arrays.copyOfRange(source,2,5);
        System.out.println("destination2 = " + Arrays.toString(destination2));

        //copying 2d Arrays using arraycopy()
        int[][] sauce = {{1,2,3,4},{5,6},{0,2,42,-4,5}};
        int[][] destination = new int[sauce.length][];

        for (int i = 0; i < sauce.length; ++i){
            //allocating space for each row of destination array
            destination[i] = new int[sauce[i].length];
            System.arraycopy(sauce[i],0,destination[i],0,destination[i].length);
        }
        //displaying destination array
        System.out.println(Arrays.deepToString(destination));
    }

}




