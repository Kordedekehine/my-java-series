package com.company.assignments;

public class Eighteen {
    public static void main(String[] args) {
        Eighteen eighteen = new Eighteen(6,3);
        eighteen.getDim();
    }

    double l,b;
    Eighteen(double length, double breadth){
     l = length;
     b = breadth;
 }
 public double setDim(){
     double results =  l * b;
     return results;
 }

 public void getDim(){
        System.out.println("Area = " +setDim());
 }

}
