package com.company.assignments.assignments;

public class Four {
    //A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
    //Ask user for their salary and year of service and print the net bonus amount

    public static void main(String[] args) {
        Employee(9000,7);
    }

    public static void Employee(double Salary, double yearOfService){
        if (yearOfService > 5){
        double  Percent =  Salary/100 * 5;
        double newSalary =Salary + Percent;
            System.out.println("Salary has been increased by 5%. Your net bonus amount is " +newSalary);
        }else
            System.out.println("Your Salary is " +Salary);
        }


    }

