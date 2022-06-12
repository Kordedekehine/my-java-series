package com.company.fan;

public class OX extends StandingFan{
    private int model;

    public OX( int model) {
        super("Ox" ,"Big", 4, "Chicken Leg", "Anti-Clockwise", true);
        this.model = model;
    }

    public void control(int rate){
        int newCelerity = getCelerity() + rate;

        if (newCelerity < 0){
            stop();
        }if (newCelerity == 1 ){
            changeVolume(1);
        }else if (newCelerity == 2){
            changeVolume(2);
        }else if (newCelerity == 3){
            changeVolume(3);
        }else if (newCelerity == 4){
            changeVolume(4);
        }
        if (newCelerity > 0){
            controlCool(newCelerity,getRotation());
        }
    }
}
