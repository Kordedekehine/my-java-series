package com.company;

public class Job {
    private String Occupation;
    private int position ;
    private int Salary;
    private String role;

    public Job(String occupation, int position, int salary, String role) {
        Occupation = occupation;
        this.position = position;
        Salary = salary;
        this.role = role;
    }

    public String getOccupation() {
        return Occupation;
    }

    public int getPosition() {
        return position;
    }

    public int getSalary() {
        return Salary;
    }

    public String getRole() {
        return role;
    }
}
