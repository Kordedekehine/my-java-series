package com.company.shapes;

public class Square extends Shape{
    private String specification;

    public Square(String name, int angle, String specification) {
        super(name, angle);
        this.specification = specification;
    }

    public void select(){
        this.degree = 260;
        rotate();
        System.out.println(specification + " triangle rotated at " +this.degree + " now playing... " );
        playSound();

    }
}
