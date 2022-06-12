package com.company;

public class Member {
     String Name;
     int Age;
     int PhoneNumber;
     String Address;
     Double Salary;

    public void setName(String name) {
        Name = name;
    }

    public void setAge(int age) {
        Age = age;
    }

    public void setPhoneNumber(int phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setSalary(Double salary) {
        Salary = salary;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public int getPhoneNumber() {
        return PhoneNumber;
    }

    public String getAddress() {
        return Address;
    }

    public Double getSalary() {
        return Salary;
    }
}
