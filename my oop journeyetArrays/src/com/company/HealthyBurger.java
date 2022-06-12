package com.company;

public class HealthyBurger extends Hamburger{
    private String HealthyExtra1Name;
    private double HealthyExtra1Price;

    private String HealthyExtra2Name;
    private double HealthyExtra2Price;

    public HealthyBurger( String meat_type, double price) {
        super("Healthy", "Brown rye ", meat_type, price);
    }

    public void addHealthAddition1(String name, double price){
        this.HealthyExtra1Name = name;
        this.HealthyExtra1Price = price;
    }

    public void addHealthAddition2(String name, double price){
        this.HealthyExtra2Name = name;
        this.HealthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();
        if (this.HealthyExtra1Name != null){
            hamburgerPrice += this.HealthyExtra1Price;
            System.out.println("Added " + this.HealthyExtra1Name + " for an extra " + this.HealthyExtra1Price);
        }
        if (this.HealthyExtra2Name != null){
            hamburgerPrice += this.HealthyExtra2Price;
            System.out.println("Added " + this.HealthyExtra2Name + " for an extra " + this.HealthyExtra2Price);
        }
        return hamburgerPrice;
    }
}
