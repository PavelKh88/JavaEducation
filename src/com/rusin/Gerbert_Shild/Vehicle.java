package com.rusin.Gerbert_Shild;

public class Vehicle {
    int passengers;
    int fuelcup;
    int mpg;

    public void range (){
        System.out.println("Distanse " + fuelcup * mpg + " miles");
    }
    public double fuelneeded(int miles){
        return (double) miles / mpg ;
    }
}
