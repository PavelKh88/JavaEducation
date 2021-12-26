package com.rusin.Exercises_Part_1_8_v1;

public class Television {
    private boolean powerTV = true;
    private int volume = 0;
    private int channel = 0;

    public boolean getStatusTV() {
        return powerTV;
    }

    public void setStatusTV(boolean statusTV) {
        this.powerTV = statusTV;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public void powerOn() {
        setStatusTV(true);
    }

    public void powerOff() {
        setStatusTV(false);
    }

    public void changeVolume (int newVolume) {
        if (powerTV) {
            if (newVolume >= 0 && newVolume <= 30) {
                volume = newVolume;
            } else {
                System.out.println("Change Volume 0-30;");
            }

        } else {
            System.out.println("PowerTV is Off!!!");
        }
    }
    void changeChannel(int newChannel){
        if(powerTV){
            if(newChannel >= 0 && newChannel <= 50){
                channel = newChannel;
            }
            else{
                System.out.println("Change Channel can 0 - 50 ");
            }
        }
        else{
            System.out.println("Power TV is Off!!!");
        }
    }






}
