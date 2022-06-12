package com.company.assignments;

public class Five {

    public static void main(String[] args) {

        schoolGradeSystem(53);
    }

    public static void schoolGradeSystem(double marks){
        if (marks < 25){
            System.out.println(" Student Grade is F");
        }else if (marks >= 25 && marks <= 45){
            System.out.println("Student Grade is E");
        }else if (marks >= 45 && marks <= 50){
            System.out.println("Student Grade is D");
        }else if (marks >= 50 && marks <= 60){
            System.out.println("Student Grade is C");
        }else if (marks >= 60 && marks <= 80){
            System.out.println("Student Grade is B");
        }else if (marks > 80){
            System.out.println("Student Grade is A");
        }else
            System.out.println("Come and lodge your complainant");
    }
}
