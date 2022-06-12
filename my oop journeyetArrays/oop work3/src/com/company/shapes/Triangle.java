package com.company.shapes;

public class Triangle extends Shape {

    private String specification;


    public Triangle(String name, int angle, String specification) {
        super(name, angle);
        this.specification = specification;
    }

    public void select(){
        this.degree = 180;
        rotate();
        System.out.println(specification + " triangle rotated at " +this.degree + " now playing... " );
        playSound();

    }
}
