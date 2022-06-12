package com.company.schoolingComp;

public class Building {
    private String location;
    private String Color;
    private String type; //(bungalow or pentHouse)
    private int numOfOffices;

    public Building(String location, String color, String type, int numOfOffices) {
        this.location = location;
        Color = color;
        this.type = type;
        this.numOfOffices = numOfOffices;
    }

    public boolean openOrClosed(boolean openOrClosed){
        System.out.println("Is the" + getClass()  + " closed? " + openOrClosed);
        return openOrClosed;
    }

    public String getLocation() {
        return location;
    }

    public String getColor() {
        return Color;
    }

    public String getType() {
        return type;
    }

    public int getNumOfOffices() {
        return numOfOffices;
    }
}
