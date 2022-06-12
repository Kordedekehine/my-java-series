package com.company;

public abstract class Students<T extends Students> {
    private String studentName;

    public Students(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }
}
