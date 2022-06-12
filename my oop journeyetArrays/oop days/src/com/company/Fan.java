package com.company;

import java.util.ArrayList;

public class Fan {
   private int switchNumber;
   private int speedRate;
   private ArrayList<StandingFan> theTypicalFan;
   private boolean isOff = false;

    public Fan(int switchNumber) {
        this.switchNumber = switchNumber;
        this.speedRate = speedRate;
        this.theTypicalFan = new ArrayList<StandingFan>();
        StandingFan standingFan = new StandingFan("Whole Fan");
        this.isOff = isOff;
        this.theTypicalFan.add(standingFan);
    }

    public int getSwitchNumber() {
        return switchNumber;
    }

    public int getSpeedRate() {
        return speedRate;
    }

    public boolean isOn() {
        return isOff;
    }

    public void changeNumber(int fanSpeed){
     if (!isOff){
         if (fanSpeed == 1){
             System.out.println("Fan Speed is changed to " + fanSpeed);
         }else if (fanSpeed == 2){
             System.out.println("Fan Speed is changed to " + fanSpeed);
         }else if (fanSpeed == 3){
             System.out.println("Fan Speed is changed to " + fanSpeed);
         }else if (fanSpeed == 4){
             System.out.println("Fan Speed is changed to " + fanSpeed);
         }else if (fanSpeed == 5){
             System.out.println("Fan Speed is changed to " + fanSpeed);
         }else
             System.out.println();
     }else
        System.out.println("The fan is currently off");
    }

    public void addStandingFans(String name){
        if (name.isEmpty()){
            this.theTypicalFan.add(new StandingFan(name));
        }
        System.out.println(name + " has been powered");
    }

    public void fanState(int yearsOfUsage){ //the years of usage minus the current expiry date
        int restDate = 5;
        int stateAnswer = restDate - yearsOfUsage;
        System.out.println("The current state and speed rate is " + stateAnswer + "X currently" );
    }

    public void fanDirection(int degreeFacing){ //before fan can be change to any direction,it must be on
        if (!isOff){
            if (degreeFacing <= 45){
                System.out.println("Fan current direction is left");
            }else if (degreeFacing <= 90){
                System.out.println("Fan current direction is right");
            }else if (degreeFacing <= 180){
                System.out.println("Fan current direction is upward");
            }else if (degreeFacing <= 360){
                System.out.println("Fan current direction is downward");
            }else
                System.out.println("");
        }else
        System.out.println("Fan cannot be turn to any direction! IT IS OFF");
        return;
    }

    public static class StandingFan{ //this class is basically a reference class...all the new fans were added into it

        private int numOfBlades;
        private int degreeFacing;
        private String name;

        public StandingFan(String name) {
            this.name = name;
            this.degreeFacing = degreeFacing;
            this.numOfBlades = numOfBlades;
        }

        public void speedImagination(int numOfBlades){
            System.out.println(" Fan is x2 faster. Must be at " + numOfBlades * 2 + " speed!!");
        }
    }
}

