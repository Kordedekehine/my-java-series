package com.company;

public class Person {
   private String name;
     private String gender;
     private int Age;
     private Job job;

    public Person(String name, String gender, int age, Job job) {
        this.name = name;
        this.gender = gender;
        Age = age;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return Age;
    }

    public Job getJob() {
        return job;
    }
}








