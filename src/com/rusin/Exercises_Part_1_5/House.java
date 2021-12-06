package com.rusin.Exercises_Part_1_5;

import javax.sound.midi.Soundbank;

public class House {
    double sHouse;
    int rooms;
    int bathrooms;
    int person;
    int floors;
    boolean elevator;
    String address;
    String country;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isElevator() {
        return elevator;
    }

    public void setElevator(boolean elevator) {
        this.elevator = elevator;
    }


    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public int getPerson() {
        return person;
    }

    public void setPerson(int person) {
        this.person = person;
    }


    public int getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }


    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }
    public double getsHouse() {
        return sHouse;
    }

    public void setsHouse(double sHouse) {
        this.sHouse = sHouse;
    }

    public void houseInfo (){
        System.out.println("Country is = " + country);
        System.out.println("Address is = " + address);
        System.out.println("Square of house = " + sHouse + "m2");
        System.out.println("Rooms in house = " + rooms);
        System.out.println("Person live in house  = " + person);
        System.out.println("Bathrooms in house  = " + bathrooms);
        System.out.println("Floors in house = " + floors);
        System.out.println("Have elevator in house = " + elevator);
    }
}
