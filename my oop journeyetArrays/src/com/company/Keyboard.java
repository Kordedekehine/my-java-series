package com.company;

public class Keyboard {
    private int numOfKeyboard;

    public Keyboard(int numOfKeyboard) {
        this.numOfKeyboard = numOfKeyboard;
    }

    public void KeyBoardDesign(String ChooseKeybord){
        System.out.println(ChooseKeybord + " keyboard has been activated");
    }

    public int getNumOfKeyboard() {
        return numOfKeyboard;
    }
}
