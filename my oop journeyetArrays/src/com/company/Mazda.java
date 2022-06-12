package com.company;

public class Mazda extends Car {
    private int roadServiceMonth;

    public Mazda( int roadServiceMonth) {
        super("Mazda", "Big Engine", 4, 4, 1, false);
        this.roadServiceMonth = roadServiceMonth;
    }

    public void accelerate(int rate){
        int newVelocity = getCurrentVelocity() + rate;

        if (newVelocity == 0){
            stop();
        }else if (newVelocity > 0 && newVelocity <= 10){
            changeGear(1);
        }else if (newVelocity > 10 && newVelocity <= 20){
            changeGear(2);
        }else if (newVelocity > 20 && newVelocity <= 30){
            changeGear(3);
        }else if (newVelocity > 30 && newVelocity <= 40) {
            changeGear(4);
        }
            if (newVelocity > 0){
                changeVelocity(newVelocity,getCurrentDirection());

        }
    }
}
