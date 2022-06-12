package com.company;
import java.util.Scanner;
public class backward {
    public static void main(String[] args) {
        // System.out.println(RightTriangle(8));
        //System.out.println(AnIscolescesTriangle(10));
        // System.out.println(RightTriangle(10));
        scanner();
    }


    public static void starCandR() {
        int r, c;
        for (r = 1; r <= 5; r++) {
            for (c = 0; c <= 5; c++) {
                System.out.println(" * " + "  ");
            }
            System.out.println(" ");
        }
    }

    public static void rightTrian() {
        int p, q;
        for (p = 0; p <= 5; p++) {
            for (q = 0; q <= p; q++) {
                System.out.println(" * " + " ");
            }
            System.out.println(" ");
        }
    }

    public static String RightTriangle(int N) {
        StringBuilder result = new StringBuilder();
        int r, j;
        for (r = 1; r <= N; r++) {
            for (j = 1; j <= r; j++) {
                result.append("*");
            }
            result.append(System.lineSeparator());
        }
        return result.toString();
    }

    public static String AnIscolescesTriangle(int N) {
        StringBuilder result = new StringBuilder();
        int p, q;
        for (p = 1; p <= N; p++) {
            for (q = 1; q <= N - p; p++) {
                result.append("  ");
            }
            for (int c = 1; c <= (p * 2) - 1; c++) {
                result.append(" * ");
            }
            result.append(System.lineSeparator());
        }
        return result.toString();
    }

    public static void scanner() {
        Scanner input = new Scanner(System.in);
        int scan = input.nextInt();
        int r, j;
        for (r = 1; r <= scan; r++) {
            for (j = 1; j <= r; j++) {
                System.out.print("*" + " ");
            }
            System.out.println(" ");
        }

    }
}