package com.company;

public class vehicle {
//challenge
    //start with a base class of a vehicle,then create a car class that inherits from the base class
    //Finally,create another class, a specific type of car that inherits from the car class.
    //you should be able to hand-steering,changing gears, and moving (speed in other words).
    //You will want to decide where to put the appropriate state and behaviors(fields and methods)
    //As mentioned above,changing gears,increasing/decreasing speed should be included
    //for your specific type of vehicle you will want to add something specific for that type of car

    private String name;
    private String size;

    private int currentVelocity;
    private int currentDirection;

    public vehicle(String name, String size) {
        this.name = name;
        this.size = size;

        this.currentVelocity = currentVelocity;
        this.currentDirection = currentDirection;
    }
    //you should be able to hand-steering,changing gears, and moving (speed in other words).
    public void steer(int direction){
        this.currentDirection += direction;
        System.out.println("Vehicle.steer(): Steering at  " + this.currentDirection + " degrees. ");
    }
    public void move(int velocity,int direction) {
        this.currentVelocity = velocity;
        this.currentDirection = direction;
        System.out.println("vehicle.move() : moving at " + velocity + " in direction " + direction);
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void stop() {
        this.currentVelocity = 0;
    }
}
