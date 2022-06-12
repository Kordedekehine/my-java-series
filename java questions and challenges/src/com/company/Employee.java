package com.company;

public class Employee extends Member{
    String Department;

    public Employee(String department) {
        Department = department;
    }

    public String getDepartment() {
        return Department;
    }
}
