package com.company.car;

public class Car extends Vehicle {
    private String model;
    private int tyre;
    private int doors;
    private boolean isManual;

    private int currentGear;

    public Car(String name, String size, String model, int tyre, int doors, int gears, boolean isManual) {
        super(name, size);
        this.model = model;
        this.tyre = tyre;
        this.doors = doors;
        this.isManual = isManual;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Set current gear to " + currentGear);
    }

    public void changeVelocity(int speed, int direction){
        move(speed,direction);
        System.out.println("Car.changeVelocity: velocity = " + speed + " the direction = " +direction);
    }
}
