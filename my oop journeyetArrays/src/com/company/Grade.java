package com.company;

public class Grade {
    private int marks;

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }

    public void departmentalGrade(int departmentalGrade) {
        if (departmentalGrade <= 40) {
            System.out.println("Fail");
        } else if (departmentalGrade >= 41 && departmentalGrade <= 50) {
            System.out.println("DD");
        }else if (departmentalGrade >= 51 && departmentalGrade <= 60){
            System.out.println("CD");
        }else if (departmentalGrade >= 61 && departmentalGrade <= 70){
            System.out.println("BC");
        }else if (departmentalGrade >= 71 && departmentalGrade <= 80){
            System.out.println("BB");
        }else if (departmentalGrade >= 81 && departmentalGrade <= 90){
            System.out.println("AB");
        }else if (departmentalGrade >= 91 && departmentalGrade <= 100){
            System.out.println("AA");
        }
    }
}