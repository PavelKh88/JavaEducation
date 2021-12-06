package com.rusin.Exercises_Part_1_5;

public class Main {
    public static void main(String[] args) {
        House myHouse = new House();
        myHouse.setAddress("Chernikova 19");
        myHouse.setBathrooms(1);
        myHouse.setsHouse(200.0);
        myHouse.setCountry("Ukraine");
        myHouse.setElevator(false);
        myHouse.setFloors(2);
        myHouse.setPerson(6);
        myHouse.setRooms(5);

        myHouse.houseInfo();
    }
}
