package com.company.car;

public class Peugeot extends Car{
    private int roadServiceMonths;

    public Peugeot(  int roadServiceMonths) {
        super("Peugeot", "3", "2008", 4, 4, 2, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate){
        int newVelocity = getCurrentVelocity() + rate;

        if (newVelocity == 0){
            changeGear(1);
            stop();
        }else if ((newVelocity > 0) && (newVelocity  <= 10)){
            changeGear(1);
        }else if ((newVelocity > 10) && (newVelocity <= 20)){
            changeGear(2);
        }else if ((newVelocity > 20) && (newVelocity <= 30)){
            changeGear(3);
        }else if ((newVelocity > 30) && (newVelocity <= 40)){
            changeGear(4);
        }
       if (newVelocity > 0){
           changeVelocity(newVelocity,getCurrentDirection());
       }
    }

}
