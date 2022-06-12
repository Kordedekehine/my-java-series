package com.company;

public class hios {
    private int pixel;
    private String launchers;
    private String graphicsType;

    public hios(int pixel, String launchers, String graphicsType) {
        this.pixel = pixel;
        this.launchers = launchers;
        this.graphicsType = graphicsType;
    }

    public int getPixel() {
        return pixel;
    }

    public String getLaunchers() {
        return launchers;
    }

    public String getGraphicsType() {
        return graphicsType;
    }
}
