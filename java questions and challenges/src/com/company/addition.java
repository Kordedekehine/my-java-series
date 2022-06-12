package com.company;

public class addition {
    //1ASSIGNMENT...write a method that perform an additional operation and the method should return the result
    // .the addititional operator must be able to perform
    //if i pass in 2 parameter,it should perform..including 3,4,5 parameter
    public static void main(String[] args) {
        int sum = additionalOperator(10,42);
        System.out.println("the summation of the 2 parameters are " +sum);
        int sum2 = additionalOperator(23,32,5);
        System.out.println("the summation of the 3 parameters are " +sum2);
        int sum3 =additionalOperator(56,32,76,23);
        System.out.println("the summation of the 4 parameters are " +sum3);
        int sum4 = additionalOperator(43,78,54,17,75);
        System.out.println("the summation of the 5 parameters are " +sum4);
    }

    static int additionalOperator(int num1,int num2){
        int Num1 = num1;
        int Num2 = num2;
        return Num1 + Num2;
    }
    static int additionalOperator(int num1,int num2,int num3){
        int Num1 = num1;
        int Num2 = num2;
        int Num3 = num3;
        return Num1 + Num2 + Num3;
    }
    static int additionalOperator(int num1,int num2,int num3,int num4){
        int Num1 = num1;
        int Num2 = num2;
        int Num3 = num3;
        int Num4 = num4;
        return Num1 + Num2 + Num3 + Num4;
    }
    static int additionalOperator(int num1,int num2,int num3,int num4,int num5){
        int Num1 = num1;
        int Num2 = num2;
        int Num3 = num3;
        int Num4 = num4;
        int Num5 = num5;
        return Num1 + Num2 + Num3 + Num4 + Num5;
    }




}
