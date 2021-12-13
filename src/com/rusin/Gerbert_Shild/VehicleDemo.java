package com.rusin.Gerbert_Shild;

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle miniven = new Vehicle();
        int range;
     miniven.passengers = 7;
     miniven.fuelcup = 16;
     miniven.mpg = 21;

     range = miniven.fuelcup * miniven.mpg;
        System.out.println("Miniven can pick " + miniven.passengers + " passengers and "  + " drive the distantce " + range + " miles");
      miniven.range();
    int dist = 120;
    double gallons;
    gallons = miniven.fuelneeded(dist);
        System.out.println( "If you wont to drive distance " + dist + " you needed " + gallons  + " gallons gas");
    }
}
