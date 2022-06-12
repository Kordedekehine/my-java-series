package com.company;

public class Member {
   private String name;
   private int Age;
   private int Phone_number;
   private String Address;
   private int Salary;

   public Member(String name, int age, int phone_number, String address, int salary) {
      this.name = name;
      Age = age;
      Phone_number = phone_number;
      Address = address;
      Salary = salary;
   }

   public String getName() {
      return name;
   }

   public int getAge() {
      return Age;
   }

   public int getPhone_number() {
      return Phone_number;
   }

   public String getAddress() {
      return Address;
   }

   public int getSalary() {
      return Salary;
   }
}
