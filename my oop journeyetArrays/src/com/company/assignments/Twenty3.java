package com.company.assignments;

public class Twenty3 {

    public static void main(String[] args) {
        Twenty3 twenty3 = new Twenty3();
        twenty3.Twenty3();

        Twenty3 twenty31 = new Twenty3();
        twenty31.Twenty3("Kolade");
    }

    private String Student;

    public void Twenty3(String student) {
        Student = student;
        System.out.println("Name of student is " +Student);
    }

    public void Twenty3(){
        System.out.println("Unknown");
    }




}
