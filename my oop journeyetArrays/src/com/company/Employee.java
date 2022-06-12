package com.company;

public class Employee {
    private String name;
    private int Year_of_joining;
    private String Address;
    private int Salary;
    private int Info;

    public void setName(String name) {
        this.name = name;
    }

    public void setYear_of_joining(int year_of_joining) {
        Year_of_joining = year_of_joining;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public void setInfo(int info) {
        Info = info;
    }

    public String getName() {
        return name;
    }

    public int getYear_of_joining() {
        return Year_of_joining;
    }

    public String getAddress() {
        return Address;
    }

    public int getSalary() {
        return Salary;
    }

    public int getInfo() {
        return Info;
    }

    public void AddSal(){
        if (Salary < 500){
            Salary += 10;
            System.out.println("$10 has been added to " + getName() + " Salary. Balance is now " +Salary);
        }else if (Salary > 500){
            System.out.println("NO additional bonus ");
        }
    }

    public void AddWork(){
        if (this.Info > 6){
            this.Salary += 5;
            System.out.println("5$ has been added to " + getName() + " Salary. Balance is now " +Salary);
        }else if (this.Info < 6){
            System.out.println("NO additional bonus ");
        }
    }
}
