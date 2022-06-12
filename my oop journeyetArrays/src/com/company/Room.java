package com.company;

public class Room {
    private String doors;
    private String bedRoom;
    private String dinning;
    private String furniture;
    private String kitchen;

    public Room(String doors, String bedRoom, String dinning, String furniture, String kitchen) {
        this.doors = doors;
        this.bedRoom = bedRoom;
        this.dinning = dinning;
        this.furniture = furniture;
        this.kitchen = kitchen;
    }

    public void bungalow(){
        getDoors();
        System.out.println("2 bedroom flat");
    }

    private String getDoors() {
        return doors;
    }

    private String getBedRoom() {
        return bedRoom;
    }

    private String getDinning() {
        return dinning;
    }

    private String getFurniture() {
        return furniture;
    }

    public String getKitchen() {
        return kitchen;
    }
}
