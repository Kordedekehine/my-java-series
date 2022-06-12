package com.company;

public class Battery {
    private int BatterPercent;

    public Battery(int batterPercent) {
        BatterPercent = batterPercent;
    }

    public boolean BatteryCharging(){
        if (true){
            System.out.println("Battery Charging>>>>");
        }
        return false;
    }
    public int getBatterPercent() {
        return BatterPercent;
    }
}
