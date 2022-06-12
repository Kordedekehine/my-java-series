package com.company;

public class another {
    //using the for method, call the calculate method with
    //the amount of 10000 with an interestRate of 1,2,3,4,5,6,7 and 8
    //and print the result to the console window
    public static void main(String[] args) {
    isEvenNumber(10);

    }
    public static void isEvenNumber(int type){
        for (int i = 1; i <= type; i++){
            if (i%2 == 0){
                System.out.println(i + "is an even number");

            }else if (i%2 != 0){
                System.out.println(i + "isssa prime number");
            }
        }
    }
}
