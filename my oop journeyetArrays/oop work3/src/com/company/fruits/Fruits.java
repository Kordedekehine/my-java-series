package com.company.fruits;

public class Fruits {
    private String type;
    private String nutrients;
    private String seeds;

    public Fruits(String type, String nutrients, String seeds) {
        this.type = type;
        this.nutrients = nutrients;
        this.seeds = seeds;
    }

    public void consumption(){
        System.out.println("it is being consumed ");
    }

    public void taste(String taste){
        System.out.println("A " + taste + " fruit");
    }

    public String getType() {
        return type;
    }

    public String getNutrients() {
        return nutrients;
    }

    public String getSeeds() {
        return seeds;
    }
}
