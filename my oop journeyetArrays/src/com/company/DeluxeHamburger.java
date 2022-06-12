package com.company;

public class DeluxeHamburger extends Hamburger{
    public DeluxeHamburger() {
        super("Deluxe", "white", "Sausage and Bacon", 4.54);
        super.addHamburgerAddition1("Chips",2.11);
        super.addHamburgerAddition2("Drinks",2.00);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Can not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Can not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Can not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Can not add additional items to a deluxe burger");
    }
}
