package com.company.shapes;

public class Circle extends Shape {
    private String specification;

    public Circle(String name, int angle, String specification) {
        super(name, angle);
        this.specification = specification;
    }

public void select(){
        rotate();
        playSound();
    System.out.println("rotated at " +getDegree() + " now playing... " +specification);
}
}
