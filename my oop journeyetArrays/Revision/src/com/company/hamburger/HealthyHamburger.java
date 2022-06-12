package com.company.hamburger;

public class HealthyHamburger extends Hamaburger  {

    private String additionHealthyHamburgerName1;
    private double additionHealthyHamburgerPrice1;

    private String additionHealthyHamburgerName2;
    private double additionHealthyHamburgerPrice2;


    public HealthyHamburger( String meat, double price) {
        super("HealthyHamburger", "Brown rye", meat, price);
    }

    public void addHealthyHamburger1(String name, double price){
        additionHealthyHamburgerName1 = name;
        additionHealthyHamburgerPrice1 = price;
    }

    public void addHealthyHamburger2(String name, double price){
        additionHealthyHamburgerName2 = name;
        additionHealthyHamburgerPrice2 = price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburger = super.itemizeHamburger();
        if (additionHealthyHamburgerName1 != null){
            hamburger += additionHealthyHamburgerPrice1;
            System.out.println("Added " + additionHealthyHamburgerName1 + " for " + additionHealthyHamburgerPrice1
            + " the total price is " +hamburger + "\n");
        }

        if (additionHealthyHamburgerName2 != null){
            hamburger += additionHealthyHamburgerPrice2;
            System.out.println("Added " + additionHealthyHamburgerName2 + " for " + additionHealthyHamburgerPrice2
                    + " the total price is " +hamburger);
        }
        return hamburger;
    }
}
