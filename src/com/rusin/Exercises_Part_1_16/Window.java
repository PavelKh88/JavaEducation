package com.rusin.Exercises_Part_1_16;

public class Window {
    private String size;
    private String color;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Window(String size, String color,String name) {
        this.color = color;
        this.size = size;
        this.name = name;
    }

    @Override

    public String toString() {
        return "Name : " + name + "   Color : " + color + " " + "Size : " + size ;
    }
}
