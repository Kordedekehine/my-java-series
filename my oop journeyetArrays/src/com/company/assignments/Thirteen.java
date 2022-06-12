package com.company.assignments;

public class Thirteen {
    public static void main(String[] args) {
        Max(44,52,67);
        Min(44,52,67);
    }

    public static void Max(int a , int b , int c) {
        if (a > b && a > c) {
            System.out.println(+a + " is the Maximum number");
        } else if (b > a && b > c) {
            System.out.println(+b + " is the Maximum number");
        } else if (c > a && c > b) {
            System.out.println(+c + " is the Maximum number");
        }
    }

        public static void Min(int a, int b , int c){
         if (b < a && b < c){
            System.out.println(+b + " is the Minimum number");
        }else if (c < a && c < b){
            System.out.println(+c +" is the Minimum number");
        }else if (a < b && a < c){
            System.out.println(+a + " is the Minimum number");
        }
    }
}
