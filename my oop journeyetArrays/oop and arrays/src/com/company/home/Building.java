package com.company.home;

public class Building {
    private SittingRoom theSittingRoom;
    private Kitchen theKitchen;
    private BathRoom theBathroom;
    private BedRoom theBedRoom;
    private VisitorsRoom theVisitorsRoom;

    public Building(SittingRoom theSittingRoom, Kitchen theKitchen, BathRoom theBathroom, BedRoom theBedRoom, VisitorsRoom theVisitorsRoom) {
        this.theSittingRoom = theSittingRoom;
        this.theKitchen = theKitchen;
        this.theBathroom = theBathroom;
        this.theBedRoom = theBedRoom;
        this.theVisitorsRoom = theVisitorsRoom;
    }

    public void Light(){
        System.out.println("All Building Light is on");
    }

    public void AC(boolean ONorOFF){
        System.out.println("is the AC working? " + ONorOFF);
    }

    public SittingRoom getTheSittingRoom() {
        return theSittingRoom;
    }

    public Kitchen getTheKitchen() {
        return theKitchen;
    }

    public BathRoom getTheBathroom() {
        return theBathroom;
    }

    public BedRoom getTheBedRoom() {
        return theBedRoom;
    }

    public VisitorsRoom getTheVisitorsRoom() {
        return theVisitorsRoom;
    }
}
