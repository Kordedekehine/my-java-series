package com.company;

public class savage {
    public static void main(String[] args) {
//no1
//prime();
        Maximum(100, 200, 300);
        Minimum(2, 3, 1);
     //   Factorial(6);
        fifteen();
        fifteent();
        twelve();
    }

    //write a program that print from 1 to 100
    public static void prime() {
        int n;
        for (n = 1; n <= 100; n++) {
            if (n % 2 == 0) {
                System.out.println(n + " is a prime number");
            } else
                System.out.println();
        }
    }

    //Define two methods to print the maximum and minimum number respectively among three numbers entered by user.
    public static void Maximum(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println(a + " is the biggest number");
        } else if (b > a && b > c) {
            System.out.println(b + " is the biggest number");
        } else if (c > a && c > b) {
            System.out.println(c + " is the biggest number");
        }else
            System.out.println("some may be equal or invalid numbers");
    }

    public static void Minimum(int a, int b, int c) {
        if (a < b && a < c) {
            System.out.println(a + " is the lesser number");
        } else if (b < a && b < c) {
            System.out.println(b + " is the lesser number");
        } else if (c < a && c < b) {
            System.out.println(c + " is the lesser number");
        }else
        System.out.println("some may be equal or invalid numbers");
    }
    public static void Factorial(int n){
        int a;
        for (a = 1; a < (n-1)*n ; a ++){
            System.out.println("The factorial number is " + a * (n-1) * n);
        }
    }
    //print the multiplication table of  15 using recursion
    public static void fifteen(){
        int num1 = 1;
        int num2 = 1;
        while (num1 <= 5 && num2<=10) {

            System.out.println("2 * " + num1 + "=" + +num2);
            num1++;
            num2++;

        }
    }
    public static void fifteent(){
        int num = 1;
        int num2 = 1;

        while (num <= 12 && num2 <= 15){
            System.out.println("15 * " + num + "=" + +num * 15);
            num++;
            num2++;
        }


    }
    public static void twelve(){
        int num = 1;
        for(num = 1; num <= 12 ; num++){
            System.out.println("12 * " + num + "=" + +num * 12);
        }
    }
}