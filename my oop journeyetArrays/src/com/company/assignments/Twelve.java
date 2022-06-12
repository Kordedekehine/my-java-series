package com.company.assignments;

public class Twelve {

    public static void main(String[] args) {
        int i = 1;
        int j = 100;

        for (i = 1; i <= 100; i++){
            if (i % 2 == 0){
                System.out.println(+i + " is an even number");
            }else if (i % 2 != 0){
                System.out.println(+i + " is a prime number");
            }
        }
    }
}
