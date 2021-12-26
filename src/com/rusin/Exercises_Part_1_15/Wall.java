package com.rusin.Exercises_Part_1_15;


import static java.util.Objects.isNull;

public class Wall {
    private String color;
    private String size;
    private Door[] doors = new Door[5];
    private Window[] windows = new Window[5];

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }



    public void statusWall(){
        System.out.println("Size : " + size);
        System.out.println("Color : " + color);
        System.out.println("Door : " + doors);
        System.out.println("Window : " + windows);
    }

    public void addDoor(Door door) {
        for (int i = 0; i < doors.length ; i++) {
            if (isNull(doors[i])) {
                doors[i] = door;
                return;
            }
        }
        Door[] newDoors = new Door[doors.length * 2];
        System.arraycopy(doors, 0, newDoors, 0, doors.length);
        newDoors[doors.length + 1] = door;
        doors = newDoors;
    }
}
