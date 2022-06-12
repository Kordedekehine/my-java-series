package com.company;

public class Triangle {

    private double Triangle;

    public void setTriangle(double a,double b, double c){
        this.Triangle = (a + b + c) / 2;
        System.out.println("The triangle perimeter is equal to : " +this.Triangle);
    }

public double getTriangle(){
        return this.Triangle;
}


}
