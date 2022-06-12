package com.company;

public class powerSupply {
    private String on;
    private String off;
    private String restart;

    public powerSupply(String on, String off, String restart) {
        this.on = on;
        this.off = off;
        this.restart = restart;
    }
public void powerOn(){
    System.out.println("Logo popOut");
    System.out.println(getRestart());
    }

    public String getOn() {
        return on;
    }

    public String getOff() {
        return off;
    }

    public String getRestart() {
        return restart;
    }
}
