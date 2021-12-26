package com.rusin.Exercises_Part_1_16;

import java.util.ArrayList;
import java.util.List;

public class Wall {
    private List<Door> doors = new ArrayList<>();
    private List<Window> windows = new ArrayList<>();

 public void addDoors(Door door) {
     doors.add(door);
 }
 public void addWindows(Window window) {
     windows.add(window);
 }
 public void wallInfo(){
     System.out.println(doors);
     System.out.println(windows);
 }
    @Override

    public String toString() {
        return "Doors : " + doors + "   " + "Windows : " + windows;
    }
}


