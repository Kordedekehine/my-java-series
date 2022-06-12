package com.company;

public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp(){
        getTheCase().powerButton();
        drawLogo();
    }

    public void drawLogo(){
        //fancy grpahics
        getMonitor().drawPixelAt(1200,50,"Yellow"); //instead of using getMonitor., you can use monitor and just go ahead
    }

    public Case getTheCase() {
        return theCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }
}
