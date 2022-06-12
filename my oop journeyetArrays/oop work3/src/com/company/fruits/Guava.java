package com.company.fruits;

public class Guava extends Fruits{
    private String name;
    private String color;
    private boolean isRipe;

    public Guava( String name, String color, boolean isRipe) {
        super("consumable", "Vitamins", "many");
        this.name = name;
        this.color = color;
        this.isRipe = isRipe;
    }


    public void taste() {
        taste("Guava is a sweet");
    }

    public void eat(){
        System.out.println("Guava is consumed by eating");
    }

    @Override
    public void consumption() {
        super.consumption();
        taste();
        eat();
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public boolean isRipe() {
        return isRipe;
    }
}
