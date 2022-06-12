package com.company;

public class Manager extends Member{

    private String specialization;
    private String department;


    public Manager(String name, int age, int phone_number, String address, int salary, String specialization, String department) {
        super(name, age, phone_number, address, salary);
        this.specialization = specialization;
        this.department = department;
    }

    public void Assign(){
        System.out.println("Assign employees to work");

    }
}
