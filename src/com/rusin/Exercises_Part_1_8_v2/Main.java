package com.rusin.Exercises_Part_1_8_v2;

public class Main {
    public static void main(String[] args) {
        Television tv1 = new Television();
        tv1.tvOn();
        System.out.println("Power Tv is : " + tv1.isTvPower());
        tv1.tvOff();
        System.out.println("Power Tv is : " + tv1.isTvPower());
        tv1.tvOn();
        System.out.println("Power Tv is : " + tv1.isTvPower());
        tv1.channelDown();
        System.out.println("Channel : " + tv1.getChannel());
        tv1.channelUp();
        System.out.println("Channel : " + tv1.getChannel());
        tv1.channelUp();
        tv1.channelUp();
        tv1.channelUp();
        tv1.channelUp();
        tv1.channelUp();
        System.out.println("Channel : " + tv1.getChannel());
        tv1.volumeDown();
        System.out.println("Volume is : " + tv1.getVolume());
        tv1.volumeUp();
        tv1.volumeUp();
        tv1.volumeUp();
        tv1.volumeUp();
        tv1.volumeUp();
        tv1.volumeUp();
        System.out.println("Volume is : " + tv1.getVolume());






    }
}
