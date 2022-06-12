package com.company.assignments.assignments;

import java.util.Scanner;

public class Nine {

    public static void main(String[] args) {
        //using for loop
        int num = 0;
        int reversenum = 0;
        ;

        System.out.println("INPUT");

        Scanner in = new Scanner(System.in);
        num = in.nextInt();

        for (;num != 0 ;){
           reversenum = reversenum * 10;
           reversenum = reversenum + num%10;
           num = num/10;
        }

        System.out.println("OUTPUT \n" +reversenum);
    }


}
