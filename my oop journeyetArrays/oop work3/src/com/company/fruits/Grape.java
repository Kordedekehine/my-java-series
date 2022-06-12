package com.company.fruits;

public class Grape extends Fruits{
    private String name;
    private String color;
    private boolean isRipe;

    public Grape( String name, String color, boolean isRipe) {
        super("consumable", "Vitamins", "many");
        this.name = name;
        this.color = color;
        this.isRipe = isRipe;
    }

    public void taste(){
        taste("Grape is a Bitter");
    }

    public void drinking(){
        System.out.println("Grape is consumed by drinking");
    }

    @Override
    public void consumption() {
        drinking();
        taste();
        super.consumption();
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
