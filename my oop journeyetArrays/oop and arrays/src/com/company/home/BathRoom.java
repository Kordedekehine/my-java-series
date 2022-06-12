package com.company.home;

public class BathRoom {
    private String Jacuzzi;
    private String TileColor;
    private int Soaps;
    private String shave;
    private Toilet theToilet;

    public BathRoom(String jacuzzi, String tileColor, int soaps, String shave, Toilet theToilet) {
        Jacuzzi = jacuzzi;
        TileColor = tileColor;
        Soaps = soaps;
        this.shave = shave;
        this.theToilet = theToilet;
    }

    public String getJacuzzi() {
        return Jacuzzi;
    }

    public String getTileColor() {
        return TileColor;
    }

    public int getSoaps() {
        return Soaps;
    }

    public String getShave() {
        return shave;
    }

    public Toilet getTheToilet() {
        return theToilet;
    }
}
