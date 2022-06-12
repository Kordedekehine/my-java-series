package com.company;

public class Fox { //method header
    public static void main(String[] args) {  //method body
     arithmetic();
    }

    public static void arithmetic() {

        int num = 10;
        int num2 = 5;

        System.out.println(num * num2);
        System.out.println(num + num2);
        System.out.println(num - num2);
        System.out.println(num / num2);
        System.out.println(num % num2);

        int sum = num + num2;
        System.out.println("The output is " + sum);

        int sub = num - num2;
        System.out.println("The output is " + sub);

        int divide = num / num2;
        System.out.println("The output is " + divide);

        int multiply = num * num2;
        System.out.println("The output is " + multiply);

        int module = num % num2;
        System.out.println("The output is " + module);
    }
}



