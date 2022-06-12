package com.company;

import java.util.ArrayList;

public class GearBox {
    private ArrayList<Gear> gears; //create an array and name it to gear
    private int maxGear; //create an int object and name it to maxGear
    private int currentGear = 0; //create an int object name it current gear and assign 0 to it
    private boolean clutchIsIn; //create a boolean value and name it clutchIsIn

    public GearBox(int maxGear) { //create the constructor for max gear and instantiate all other objects under it
        this.maxGear = maxGear;
        this.gears = new ArrayList<Gear>();
        Gear neutral = new Gear(0,0.0); //create new gear object to link to the below gear class
        this.gears.add(neutral); //this objects helps us add our

        for (int i = 0; i < maxGear; i++){
            System.out.println();
        }
    }

    public void operateClutch(boolean in){

        this.clutchIsIn = in;
    }

    public void addGear(int number, double ratio){
        if ((number > 0) && (number <= 0)){
            this.gears.add(new Gear(number,ratio));
        }
    }

    public void changeGear(int newGear){
        if ((newGear >= 0) && (newGear < this.gears.size()) && this.clutchIsIn){
            this.currentGear = newGear;
            System.out.println("Gear " + newGear + " selected");
        }else
            System.out.println("Grind!");
        this.currentGear = 0;
    }

    public double wheelSpeed(double rev){
        if (clutchIsIn){
            System.out.println("Scream!!");
            return 0.0;
        }
        return rev * gears.get(currentGear).getRatio();
    }



private class Gear{ //Tim Bulchalka was basically operating the gear without involving the gear class
  //it is possible based on the fact that the gear is the innerclass of the gear box in that case it is not necessary for us
  //to access it directly,as long as we can directly get its object in the outerclass, we can just do the prototype of the
    //innerclass constructor and directly get it from there without touching the real class
        private int gearNumber;
        private double ratio;

    public Gear(int gearNumber, double ratio) {
        this.gearNumber = gearNumber;
        this.ratio = ratio;
    }
public double driveSpeed(int revs){
        return revs * (this.ratio);
}

    public double getRatio() {
        return ratio;
    }
}



}
