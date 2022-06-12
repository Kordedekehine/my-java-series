package com.company;

public class Sound {
    private int PowerVolume;
    private int RingingTuneVolume;
    private int MessageTuneVolume;
    private int AudioVolume;
    private int VideoVolume;

    public Sound(int powerVolume, int ringingTuneVolume, int messageTuneVolume, int videoVolume, int audioVolume) {
        PowerVolume = powerVolume;
        RingingTuneVolume = ringingTuneVolume;
        MessageTuneVolume = messageTuneVolume;
        VideoVolume = videoVolume;
        AudioVolume = audioVolume;
    }

    public int getPowerVolume() {
        return PowerVolume;
    }

    public int getRingingTuneVolume() {
        return RingingTuneVolume;
    }

    public int getMessageTuneVolume() {
        return MessageTuneVolume;
    }

    public int getAudioVolume() {
        return AudioVolume;
    }

    public int getVideoVolume() {
        return VideoVolume;
    }
}
