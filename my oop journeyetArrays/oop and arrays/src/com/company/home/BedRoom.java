package com.company.home;

public class BedRoom {
    private String Bed;
    private int pillows;
    private String bedSheet;
    private int cupBoard;

    public BedRoom(String bed, int pillows, String bedSheet, int cupBoard) {
        Bed = bed;
        this.pillows = pillows;
        this.bedSheet = bedSheet;
        this.cupBoard = cupBoard;
    }

    public void makeBed(){
        System.out.println("making bed...");
    }

    public void Lamp(){
        System.out.println("put the lamp on");
        makeBed();
    }

    public String getBed() {
        return Bed;
    }

    public int getPillows() {
        return pillows;
    }

    public String getBedSheet() {
        return bedSheet;
    }

    public int getCupBoard() {
        return cupBoard;
    }
}
