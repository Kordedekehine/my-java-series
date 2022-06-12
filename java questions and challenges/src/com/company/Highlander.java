package com.company;

public class Highlander implements Ivehicle {
    private String model;
    private int gear;
    private int changeGear;
    private boolean fueled = true;

    public Highlander(String model) {
        this.model = model;
    }

    @Override
    public void move(int moving) {
        this.gear = gear + moving;
        if (!fueled){
            if (gear > 1){
                System.out.println("The car is moving now");
            }else
                System.out.println("The car is not moving due to insufficient fuel");
        }else
            System.out.println("No fuel, car not moving");
    }

    @Override
    public void speed(int km) {
     if (km <= 20){
         changeGear = 2;
         System.out.println("The speed is currently at " + km + " in the gear " + changeGear);
     }else if (km <= 40){
         changeGear = 3;
         System.out.println("The speed is currently at " + km + " in the gear " + changeGear);
     }else if (km <= 60){
         changeGear = 4;
         System.out.println("The speed is currently at " + km + " in the gear " + changeGear);
     }else
        System.out.println("Cant speed the km " + km + " is not fast enough");
    }

    @Override
    public void accelerate(int stop) {
     gear = stop + gear;
     if (gear < 1){
         System.out.println("The vehicle should accelerate and stop");
     }else
         System.out.println("The vehicle cannot accelerate as gear is more than 1");
    }

    @Override
    public void vehicleSound() {
    }
}
