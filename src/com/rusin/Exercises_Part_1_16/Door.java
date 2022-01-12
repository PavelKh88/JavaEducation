package com.rusin.Exercises_Part_1_16;

public class Door {
    private Size size;
    private String color;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public Door (Size size, String color, String name) {
        this.color = color;
        this.size = size;
        this.name = name;
    }
    @Override

    public String toString() {
        return "Name : " + name + "   " + "Color : " + color + "   " + "Size : " + size ;
    }
}
