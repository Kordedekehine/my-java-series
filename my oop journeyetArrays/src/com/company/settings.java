package com.company;

public class settings {
    private String sound;
    private String backUps;
    private int batteryPercent;
    private String connection;
    private int phoneVersion;

    public settings(String sound, String backUps, int batteryPercent, String connection, int phoneVersion) {
        this.sound = sound;
        this.backUps = backUps;
        this.batteryPercent = batteryPercent;
        this.connection = connection;
        this.phoneVersion = phoneVersion;
    }

    public void newUpdateAlert(int a){
        System.out.println("Update your phone to higher version of " + a);
    }

    public String getSound() {
        return sound;
    }

    public String getBackUps() {
        return backUps;
    }

    public int getBatteryPercent() {
        return batteryPercent;
    }

    public String getConnection() {
        return connection;
    }

    public int getPhoneVersion() {
        return phoneVersion;
    }
}
