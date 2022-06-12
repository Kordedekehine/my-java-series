package com.company;

public class allright {
    public static void main(String[] args) {
        BodyMass();
    }
   /* static double BodyMass(double weight, double height) {
        //  how to put different datatypes inside one
        return weight * height;
    }


    public static void main(String[] args) {
        double Korede = BodyMass(67.0, 5.5);
        System.out.println("Korede bodymass is equal to " + Korede); */
    static void BodyMass(){
        double weight = 67.0;
        double height = 5.5;
        double BodyMass = weight * height;
        System.out.println("BodyMass is equal to " + BodyMass);
    }



}
