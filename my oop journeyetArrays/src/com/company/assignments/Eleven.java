package com.company.assignments;

public class Eleven {
    public static void main(String[] args) {
        MultiplicationTable(24,50,29);
    }

    public static void MultiplicationTable(int a,int b,int c){
       int num = 0;
        for (int i = 0; i <= 12; i++ ){
            System.out.println(+a + " * " +num + " = " +i * a + "    \f   " +b + " * " +num + " = " +i * b + "    \f   " +c + " * " +num + " = " +i * c);
           num++;
        }
    }
}
