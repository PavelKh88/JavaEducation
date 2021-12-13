package com.rusin.Gerbert_Shild;

public class TwoVehicles {
    public static void main(String[] args) {
        Vehicle miniven = new Vehicle();
        Vehicle sportcar = new Vehicle();
        int range1, range2;

        miniven.passengers = 7;
        miniven.fuelcup = 16;
        miniven.mpg =21;

        sportcar.passengers = 2;
        sportcar.fuelcup = 14;
        sportcar.mpg = 12;

        range1 = miniven.fuelcup * miniven.mpg;
        range2 = sportcar.fuelcup * sportcar.mpg;
        System.out.println("miniven can pick " + miniven.passengers + " can drive distance " + range1);
        System.out.println("sportCar can pick " + sportcar.passengers + " can drive distance " + range2);

        Vehicle car1 = new Vehicle();
        car1.mpg = 3;
        Vehicle car2 = car1;
        Vehicle car3 = new Vehicle();

        System.out.println(car2.mpg);
        System.out.println(car1.mpg);
        System.out.println(car3.mpg);

        miniven.range();
        sportcar.range();



    }
}
