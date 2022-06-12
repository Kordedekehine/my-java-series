package com.company;

public class construct {   //constructor
   /* int modelYear;
    String modelName;

    public construct(int year, String name) {  //note that you can only access public using object
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        construct myCar = new construct(1969,"Mustang");
        System.out.println(myCar.modelName + " " + myCar.modelYear);
    } */
    private String formatNumber(int value) {
        return String.format("%d",value);
    }
    private String formatNumber(double value) {
        return String.format("%.3f",value);
    }
    private String formatNumber(String value) {
        return String.format("%.2f",Double.parseDouble(value));
    }

    public static void main(String[] args) {
        construct hs = new construct();
        System.out.println(hs.formatNumber(500));
        System.out.println(hs.formatNumber(89.9934));
        System.out.println(hs.formatNumber(hs.formatNumber("550")));
    }
}
