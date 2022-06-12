package com.company.assignment;

public class Ass6 {
    //Copying array using iteration
    public static void main(String[] args) {
//        int a [] = {1,8, 3};
//
//        //create an array b[] of same size as a[]
//        int b [] = new int[a.length];
//
//        //copy elements of a[] to b[]
//        for (int i = 0; i < a.length; i++){
//            b[i] = a[i];
//
//            //change b[] to verify that b is different from a[]
//            b[0]++;
//
//            System.out.println("Contents of a[] ");
//            for ( i = 0; i < a.length; i++){
//                System.out.println(a[i] + " ");
//            }
//
//            for (i = 0; i < b.length; i++){
//                System.out.println(b[i] + " ");
//            }
//        }

         int a [] = {1, 8, 3};

         //copy elements of a[] to b[]
        int b[] = a.clone();

        //change b[] to verify that
        //b[] is different from a[]
        b[0]++;

        System.out.println("Contents of a[] ");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");

        for (int i = 0; i < b.length; i++)
            System.out.println(" \n" + b[i] + " ");

    }

}
