package com.rusin.Exercises_Part_1_8_v1;

public class Main {
    public static void main(String[] args) {
        Television tv1 = new Television();

        tv1.powerOff();

        System.out.println("Power tv is On: " + tv1.getStatusTV());

        tv1.powerOn();

        System.out.println("Power tv is On :" + tv1.getStatusTV());

        tv1.changeVolume(3);
        System.out.println("Volume is " + tv1.getVolume());

        tv1.changeVolume(31);
        System.out.println("Volume is " + tv1.getVolume());
        tv1.powerOff();
        tv1.changeVolume(1);
        System.out.println("Volume is " + tv1.getVolume());

        tv1.powerOn();
        tv1.changeChannel(20);
        System.out.println(tv1.getChannel());
        tv1.changeChannel(51);
        System.out.println(tv1.getChannel());

    }

}
