package com.company;

public class Manager extends  Member{
    String Specialization;


    public Manager(String specialization) {
        Specialization = specialization;
    }

    public String getSpecialization() {
        return Specialization;
    }
}
