package com.company.assignments;

public class Two {

    public static void main(String[] args) {
       TwoInput(9,6);
    }



    public static void TwoInput(int a, int b){
        if (a > b){
            System.out.println(a +" is greater than " +b);
        }else if (b > a){
            System.out.println( b + " is greater than " +a);
        }else if (a == b || b == a){
            System.out.println(a + " and " +b +" are both equal");
        }else
            System.out.println("null");
    }





}
