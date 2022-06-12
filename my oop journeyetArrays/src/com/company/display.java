package com.company;

public class display {
    private int brightness;
    private int contrast;
    private String mode;
    private String customizeSettings;
    private hios Hios;

    public display(int brightness, int contrast, String mode, String customizeSettings, hios hios) {
        this.brightness = brightness;
        this.contrast = contrast;
        this.mode = mode;
        this.customizeSettings = customizeSettings;
        Hios = hios;
    }

    public int getBrightness() {
        return brightness;
    }

    public int getContrast() {
        return contrast;
    }

    public String getMode() {
        return mode;
    }

    public String getCustomizeSettings() {
        return customizeSettings;
    }

    public hios getHios() {
        return Hios;
    }
}
