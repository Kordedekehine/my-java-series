package com.company.home;

public class Toilet {
    private String WC;
    private String bleachingSoap;
    private int brushes;
    private String sanitizer;

    public Toilet(String WC, String bleachingSoap, int brushes, String sanitizer) {
        this.WC = WC;
        this.bleachingSoap = bleachingSoap;
        this.brushes = brushes;
        this.sanitizer = sanitizer;
    }

    public void flushToilet(){
        System.out.println("flushing toilet");
    }

    public void afterMath(){
        flushToilet();
        System.out.println("using the " + this.sanitizer);
    }

    public String getWC() {
        return WC;
    }

    public String getBleachingSoap() {
        return bleachingSoap;
    }

    public int getBrushes() {
        return brushes;
    }

    public String getSanitizer() {
        return sanitizer;
    }
}
