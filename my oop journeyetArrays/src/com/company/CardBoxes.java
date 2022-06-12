package com.company;

public class CardBoxes {
    private int SimBox;
    private int MemoryBox;

    public CardBoxes(int simBox, int memoryBox) {
        SimBox = simBox;
        MemoryBox = memoryBox;
    }

    public int getSimBox() {
        return SimBox;
    }

    public int getMemoryBox() {
        return MemoryBox;
    }
}
