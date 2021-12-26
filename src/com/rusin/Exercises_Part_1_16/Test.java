package com.rusin.Exercises_Part_1_16;

public class Test {
    public static void main(String[] args) {
   ClassRoom classRoom1 = new ClassRoom("ClassRoom1");
   Wall wall1 = new Wall();
   Wall wall2 = new Wall();
   Wall wall3 = new Wall();
   Wall wall4 = new Wall();
   Window window1 = new Window("150 x 200", "White", "window1");
   Window window2 = new Window("200 x 200", "Brown", "window2");
   Window window3 = new Window("150 x 200", "White", "window3");
   Window window4 = new Window("150 x 200", "White", "window4");
   Door door1 = new Door("200 x 60", "White", "door1");
   Door door2 = new Door("200 x 70", "Brown", "door2");
  classRoom1.addWalls(wall1);
  classRoom1.addWalls(wall2);
  classRoom1.addWalls(wall3);
  classRoom1.addWalls(wall4);
   wall3.addWindows(window1);
   wall3.addWindows(window3);
   wall3.addWindows(window4);
   wall3.addDoors(door1);
   wall4.addWindows(window2);
   wall4.addDoors(door2);
  // classRoom1.classRoomInfo();//Не получаеться красиво вывести Инфо КлассРум
   wall3.wallInfo();




    }
}
