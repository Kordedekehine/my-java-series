package com.company;

public class progress {
    public static void main(String[] args) {
        prime(24);
        even(44);
        System.out.println(squareRoot(9,2));
    }

    public static boolean prime(int p) {
        if (p == 0) {
            System.out.println(p + " not a prime number");
            return false;
        }
        for (int i = 2; i <= p / 2; i++) {
            if (p % i == 0) {
                System.out.println(p + " is not a prime number");
                return false;
            }
        }
        System.out.println(p + "is a prime number");
        return true;
    }

    static boolean even(int e) {
        if (e % 2 == 0) {
            System.out.println(e + " is an even number");
            return true;
        } else
            System.out.println(e + " is not an even number");
        return false;
    }

    static boolean squareRoot(int base, int power) {
        int result = 1;
        for (int i = 1; i <= power; i++) {
          result *= base;
        }
        System.out.println("the root of the " +base + " raise to power " +power + " = " + result);
        return true;
    }


}



