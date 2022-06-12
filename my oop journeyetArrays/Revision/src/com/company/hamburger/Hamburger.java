package com.company.hamburger;

public class Hamburger {
    private String name;
    private String BreadRollType;
    private String meat;
    private double price ;

    public Hamburger(String name,String breadRollType, String meat, double price) {
        this.name = name;
        BreadRollType = breadRollType;
        this.meat = meat;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void Carrot(){
      int  cost = 1;
        System.out.println("Carrot cost is " +cost);
        this.price += cost;
        System.out.println("Carrot added! total price is now " + this.price + "\n");
    }

    public void Lettuce(){
       int cost = 2;
        System.out.println("Lettuce cost is " +cost);
        this.price += cost;
        System.out.println("Lettuce added! total price is now " + this.price + "\n");
    }

    public void Tomatoes(){
      int  cost = 3;
        System.out.println("Tomatoes cost is " +cost);
        this.price += cost;
        System.out.println("Tomatoes added! total price is now " + this.price + "\n");
    }

    public String getBreadRollType() {
        return BreadRollType;
    }

    public String getMeat() {
        return meat;
    }

    public String getName() {
        return name;
    }
}
