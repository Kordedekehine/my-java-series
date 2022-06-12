package com.company.assignments;

public class Twenty2 {
    //program name suppose to be employee
    public static void main(String[] args) {
        Twenty2 twenty2 = new Twenty2();
        twenty2.getInfo(678,4);
        System.out.println(twenty2.AddSal());
        System.out.println(twenty2.AddWork());
    }
     private int Salary;
     private int HoursOfWork;

    public Twenty2() {
        Salary = 0;
        HoursOfWork = 0;
    }

    public void getInfo(int Sal, int HOW){
        Salary = Sal;
        HoursOfWork = HOW;

    }

    public int AddSal(){
        if (Salary < 500){
            Salary += 10;
        }
        return Salary;
    }
    public int AddWork(){
        if (HoursOfWork > 6){
            Salary += 5;
        }
        return Salary;
    }
}
