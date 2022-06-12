package com.company;

public class PhoneCase {
    private int Screw;
    private String ScreenGuide;
    private String body;
    private String BackCover;

    public PhoneCase(int screw, String screenGuide, String body, String backCover) {
        Screw = screw;
        ScreenGuide = screenGuide;
        this.body = body;
        BackCover  = backCover;
    }


    public int getScrew() {
        return Screw;
    }

    public String getScreenGuide() {
        return ScreenGuide;
    }

    public String getBody() {
        return body;
    }

    public String getBackCover() {
        return BackCover;
    }
}
