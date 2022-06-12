package com.company;

public class DeluxeYoghurt extends Yoghurt{

    public DeluxeYoghurt() {
        super("S.Korede DELUXE", "Chocolate,Vanilla,Strawberry", "Refined Milk", 7.0);
        super.addYoghurtAddition1("SpecialCake",3.1);
        super.addYoghurtAddition2("Your Choice Snacks",6.0);
    }

    @Override
    public void addYoghurtAddition1(String name, double price) {
        System.out.println("Cant add an additional items to the deluxe");
    }

    @Override
    public void addYoghurtAddition2(String name, double price) {
        System.out.println("Cant add an additional items to the deluxe");
    }

    @Override
    public void addYoghurtAddition3(String name, double price) {
        System.out.println("Cant add an additional items to the deluxe");
    }

    @Override
    public void addYoghurtAddition4(String name, double price) {
        System.out.println("Cant add an additional items to the deluxe");
    }

    @Override
    public void addYoghurtAddition5(String name, double price) {
        System.out.println("Cant add an additional items to the deluxe");
    }
}
