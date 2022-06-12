package com.company;

public class Screen {
    private int width;
    private int height;

    public Screen(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void drawLogo(String Welcome){
        System.out.println(Welcome + " welcome to Best Digital experience");
    }


    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
