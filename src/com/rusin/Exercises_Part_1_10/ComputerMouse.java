package com.rusin.Exercises_Part_1_10;

public class ComputerMouse {
    private int numbersOfButtons;
    private int numbersOfScrolls;
    private int dpiValue;
    private int clickButton;
    private int clockScroll;
    private String model;
    private double weight;
    private String size;
    private String color;
    private String yearOfAssembling;
    private String serialNumber;
    private String connectionType;


    public int getNumbersOfButtons() {
        return numbersOfButtons;
    }

    public void setNumbersOfButtons(int numbersOfButtons) {
        this.numbersOfButtons = numbersOfButtons;
    }

    public int getNumbersOfScrolls() {
        return numbersOfScrolls;
    }

    public void setNumbersOfScrolls(int numbersOfScrolls) {
        this.numbersOfScrolls = numbersOfScrolls;
    }

    public int getDpiValue() {
        return dpiValue;
    }

    public void setDpiValue(int dpiValue) {
        this.dpiValue = dpiValue;
    }

    public int getClickButton() {
        return clickButton;
    }

    public void setClickButton(int clickButton) {
        this.clickButton = clickButton;
    }

    public int getClockScroll() {
        return clockScroll;
    }

    public void setClockScroll(int clockScroll) {
        this.clockScroll = clockScroll;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
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

    public String getYearOfAssembling() {
        return yearOfAssembling;
    }

    public void setYearOfAssembling(String yearOfAssembling) {
        this.yearOfAssembling = yearOfAssembling;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getConnectionType() {
        return connectionType;
    }

    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
    }

    void infoMouse(){
        System.out.println("Numbers of buttons : " + numbersOfButtons);
        System.out.println("Numbers Of Scrolls : " + numbersOfScrolls);
        System.out.println("DPI Value : " + dpiValue);
        System.out.println("Click Button : " + clickButton);
        System.out.println("Clock Scroll : " + clockScroll);
        System.out.println("Model : " + model);
        System.out.println("Weight : " + weight);
        System.out.println("Size : " + size);
        System.out.println("Color : " + color);
        System.out.println("Year Of Assembling : " + yearOfAssembling);
        System.out.println("Serial Number : " + serialNumber);
        System.out.println("Connection Type : " + connectionType);
    }
}
