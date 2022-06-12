package com.company.assignment;
//get the minimum value and the maximum value of the array

public class Ass7 {
    public static void main(String[] args) {
        int numbers [] = {1,2,3,4,5,67,7,8,9,};
        System.out.println( getMinValue(numbers) + " is the minimum value");
        System.out.println(getMaxValue(numbers) + " is the maximum value");
    }

    public static int getMaxValue(int [] numbers){
        int maxValue = numbers[0];
        for (int i = 1; i < numbers.length; i++){
            if (numbers[i] > maxValue){
                maxValue = numbers[i];
            }
        }
        return maxValue;
    }

    public static int getMinValue(int [] numbers){
        int minValue = numbers[0];
        for (int i = 1; i < numbers.length;i++){
            if (numbers[i] < minValue){
                minValue = numbers[i];
            }
        }
        return minValue;
    }
}
