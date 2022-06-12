package com.company.home;

public class SittingRoom {
    private String Door;
    private String chairSet;
    private String table;
    private String ArtsDecoration;
    private String TelevisionSets;
    private DinningRoom theDinningRoom;

    public SittingRoom(String door, String chairSet, String table, String artsDecoration, String televisionSets,  DinningRoom theDinningRoom) {
        Door = door;
        this.chairSet = chairSet;
        this.table = table;
        ArtsDecoration = artsDecoration;
        TelevisionSets = televisionSets;
        this.theDinningRoom = theDinningRoom;
    }


    public String getDoor() {
        return Door;
    }

    public String getChairSet() {
        return chairSet;
    }

    public String getTable() {
        return table;
    }

    public String getArtsDecoration() {
        return ArtsDecoration;
    }

    public String getTelevisionSets() {
        return TelevisionSets;
    }

    public DinningRoom getTheDinningRoom() {
        return theDinningRoom;
    }
}
