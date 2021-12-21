package com.rusin.Exercises_Part_1_8_v2;

public class Television {
    private boolean tvPower = false;
    private int channel = 0;
    private int volume = 0;


    public boolean isTvPower() {
        return tvPower;
    }

    public void setTvPower(boolean tvPower) {
        this.tvPower = tvPower;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void tvOn(){
        tvPower = true;
    }
    public void tvOff(){
        tvPower = false;
    }
    public void channelUp(){
        channel += 1;
    }
    public void channelDown(){
        if(channel > 0 & channel <= 100 ){
            channel -= 1;
        }
        else {
            System.out.println("Channel can change 0 - 100");
        }
    }

    public void volumeUp(){
        if(volume >= 0 && volume <= 30 ){
            volume += 1;
        }
        else{
            System.out.println("Volume can change 0 - 30");
        }
    }
    public void volumeDown(){
        if(volume > 0 && volume <= 30 ){
            volume -= 1;
        }
        else{
            System.out.println("Volume can change 0 - 30");
        }
    }


}
