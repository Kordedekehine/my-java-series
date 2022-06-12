package com.company.assignments.assignments;

public class Eight {
    public static void main(String[] args) {
        employeeDetails(21,'M');
    }

    public static void employeeDetails(int age,char sex){
        if ((age >= 20 && age <= 40) && sex == 'M'){
            System.out.println("Can work anywhere");
        }else if ((age >= 20 && age <= 60) && sex == 'F'){
            System.out.println("can only work in urban areas");
        }else if ((age >= 40 && age <= 60) && sex == 'M'){
            System.out.println("Can only work in Urban areas");
        }else
            System.out.println("Error");
    }
}
