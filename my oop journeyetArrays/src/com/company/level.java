package com.company;

public class level {
    //write a program to print the area of a rectangle by creating a class named 'Area' having two methods.
    //first method named as 'setDim' takes length and breadth of rectangle as parameters
    //second method  named as 'getArea' returns the area of the rectangle.
    //Length and breadth of rectangle are entered through keyboard

   private int Dim;

    public int getDim( ) {

        return this.Dim;
    }

    public void setDim(int length,int breadth) {

        this.Dim = length * breadth;
        System.out.println(" the area of the input length and breadth triangle is : " +this.Dim);
    }
}
