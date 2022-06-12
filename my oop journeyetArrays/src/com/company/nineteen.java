package com.company;

public class nineteen {

    private String Student;
    private int roll_no;

    public void setStudent(String student) {
        Student = student;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public String getStudent() {
        return Student;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public static void main(String[] args) {
        nineteen Nineteen = new nineteen();
        Nineteen.setStudent("John");
        Nineteen.setRoll_no(2);

        System.out.println("Name of the student is " +Nineteen.getStudent() +" and roll number is roll no" +Nineteen.getRoll_no());
    }
}

