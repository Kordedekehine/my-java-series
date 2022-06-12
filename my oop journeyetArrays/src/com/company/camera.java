package com.company;

public class camera {
    private String lens;
    private String megaPixel;
    private int selfTimer;
    private String video;
    private String shutterSound;

    public camera(String lens, String megaPixel, int selfTimer, String video, String shutterSound) {
        this.lens = lens;
        this.megaPixel = megaPixel;
        this.selfTimer = selfTimer;
        this.video = video;
        this.shutterSound = shutterSound;
    }

    public void picturePreviewSize(int a){
        System.out.println("The picture preview size is " +a);
    }

    public String getLens() {
        return lens;
    }

    public String getMegaPixel() {
        return megaPixel;
    }

    public int getSelfTimer() {
        return selfTimer;
    }

    public String getVideo() {
        return video;
    }

    public String getShutterSound() {
        return shutterSound;
    }
}
