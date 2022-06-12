package com.company;

public class trials {
    public static void main(String[] args) {
firstNumbers();

        int even = 2;
        int notEven = 100;

        for ( even = 2; even <= notEven; even++){
            EvenNumbers(even);
        }
    }
    static boolean EvenNumbers(int even){
        if (even % 2 == 0){
            System.out.println(even + " is an even number");
            return true;
        }else
        System.out.println(even + " not an even number");
        return false;
    }
    static void firstNumbers(){
          int sum = 0;
        for (int  b = 1; b <= 10; b++ ) {
            sum += b;
            System.out.println("the sum of the First ten numbers are " + sum);
        }
        System.out.println("hello");
    }
    static boolean multNums(int m) {
        for (int num = 0; num <= 12; num++) {
            System.out.println(m + " * " + num + " = " + m * num);
            num++;
        }
        System.out.println(" ");
        return false;
    }
}
