package com.company;

public class Phone {
    private PhoneCase phoneCase;
    private Screen screen;
    private Keyboard keyboard;
    private Battery battery;
    private CardBoxes cardBoxes;
    private Sound sound;

    public Phone(PhoneCase phoneCase, Screen screen, Keyboard keyboard, Battery battery, CardBoxes cardBoxes) {
        this.phoneCase = phoneCase;
        this.screen = screen;
        this.keyboard = keyboard;
        this.battery = battery;
        this.cardBoxes = cardBoxes;
    }



    public boolean Power(String Power){
        screen.drawLogo("UserLove");
        if (true){
            System.out.println("power on");
        }
        return false;
    }

    public boolean Sound(String Sound){
        if (true){
            System.out.println("Sound on");
        }
        return false;
    }

    public PhoneCase getPhoneCase() {
        return phoneCase;
    }

    public Screen getScreen() {
        return screen;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public Battery getBattery() {
        return battery;
    }

    public CardBoxes getCardBox() {
        return cardBoxes;
    }

    public Sound getSound() {
        return sound;
    }
}
