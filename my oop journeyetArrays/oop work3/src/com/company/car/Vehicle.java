package com.company.car;

public class Vehicle {
    private String name;
    private String size;

    private int currentDirection;
    private int currentVelocity;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;

        this.currentDirection = 0;
        this.currentVelocity = 0;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public void steering(int direction){
        this.currentDirection += direction;
        System.out.printf("the current speed towards direction at %d", currentDirection,  " degrees" );
    }

    public void move( int velocity, int direction){
        this.currentVelocity = velocity;
      this.currentDirection = direction;
        System.out.println("Vehicle moving at the direction of " +direction + " at the speed of " +velocity);
    }

    public void stop(){
        this.currentVelocity = 0;
        System.out.println("stop vehicle");
    }
}
