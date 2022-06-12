package com.company.shapes;

public class Shape {
    private String name;
    private int angle;

    public int degree;

    public Shape(String name, int angle) {
        this.name = name;
        this.angle = angle;
        this.degree = 360;
    }

    public String getName() {
        return name;
    }

    public int getAngle() {
        return angle;
    }

    public int getDegree() {
        return degree;
    }

    public void rotate(){
        System.out.println(this.degree + " rotation....");
    }

    public void playSound(){
        System.out.println("AIF sound currently playing");
    }
}
