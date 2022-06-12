package com.company.home;

public class VisitorsRoom {
    private int bed;
    private int chair;
    private String wardRobe;
    private String TelevisionSets;

    public VisitorsRoom(int bed, int chair, String wardRobe, String televisionSets) {
        this.bed = bed;
        this.chair = chair;
        this.wardRobe = wardRobe;
        TelevisionSets = televisionSets;
    }

    public void switchLight(){
        System.out.println("The light is on");
    }

    public void adJustRoom(){
        switchLight();
        System.out.println("Adjusting the room");
    }



    public int getBed() {
        return bed;
    }

    public int getChair() {
        return chair;
    }

    public String getWardRobe() {
        return wardRobe;
    }

    public String getTelevisionSets() {
        return TelevisionSets;
    }
}
