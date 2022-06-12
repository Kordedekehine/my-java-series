package com.company;

public class bodies {
    private String screenSize;
    private String memorySlot;
    private int functionalButton;
    private int phoneSize;
    private int touchResponsive;
    private powerSupply PowerSupply;

    public bodies(String screenSize, String memorySlot, int functionalButton, int phoneSize, int touchResponsive, powerSupply powerSupply) {
        this.screenSize = screenSize;
        this.memorySlot = memorySlot;
        this.functionalButton = functionalButton;
        this.phoneSize = phoneSize;
        this.touchResponsive = touchResponsive;
        PowerSupply = powerSupply;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public String getMemorySlot() {
        return memorySlot;
    }

    public int getFunctionalButton() {
        return functionalButton;
    }

    public int getPhoneSize() {
        return phoneSize;
    }

    public int getTouchResponsive() {
        return touchResponsive;
    }

    public powerSupply getPowerSupply() {
        return PowerSupply;
    }
}
