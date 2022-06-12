package com.company.assignments.assignments;

public class One {
    public static void main(String[] args) {
        rectangleOrSquare(21,21);
    }

    public static void rectangleOrSquare(int length, int breadth){
        if (length == breadth){
            System.out.println("Square! both sides are equal");
        }else
            System.out.println("Rectangle! both sides are not equal");
    }
}
