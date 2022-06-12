package com.company;

public class Correction { //method header


  /*  static double BodyMass(double weight, double height) {
        //  how to put different datatypes inside one
        return weight * height;
    }


    public static void main(String[] args) {
        double Korede = BodyMass(67.0, 5.5);
        System.out.println("Korede bodymass is equal to " + Korede);
    }

    static void BodyMass(double weight , double height) {
         System.out.println("Korede Bodymass is equal to 368.5");
     } */


    public static int twoNumbers(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        int num1 = 25;
        int num2 = 15;

        Correction obj = new Correction();  //call the public class that is neither the void
        //calling method
        int result = obj.twoNumbers(num1, num2);
        System.out.println("sum is :" + result);

 /*  public void display1(int a) {
        System.out.println("hello");
    }

    public void display2(int b) {
        System.out.println("hello2");
    }

    public static void Correction(String[] args) {
        Correction obj = new Correction(); //to call the method we need to call the main method
        obj.display1(1);
        obj.display2(5);
    }*/
    }
}


   // write a program that calculates the Bmi(body mass) of a person.using formular..Body mass= weight * height//using void and non void

