package com.company.fan;

public class StandingFan extends Fan {
    private int wings;
    private String stander;
    private String flexibility;
    private boolean isPowered;

    private int volume;

    public StandingFan(String name, String size, int wings, String stander, String flexibility, boolean Ispowered) {
        super(name, size);
        this.wings = wings;
        this.stander = stander;
        this.flexibility = flexibility;
        this.isPowered = Ispowered;
        this.volume = 0;
    }

    public void changeVolume(int volume){
        this.volume = volume;
        System.out.println("The fan volume is set to " +volume);
    }

    public void controlCool(int speed,int rotation){
        cool(speed,rotation);
        System.out.println("Fan is currently at the speed of " +speed + " at the " + rotation + " degree");
    }
}
