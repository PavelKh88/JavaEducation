package com.rusin.Exercises_Part_1_11;

public class ComputerKeyboard {
   private int numbersOfKeys;
   private String color;
   private boolean mechanical;
   private String size;
   private String yearOfAssembling;
   private String serialNumber;
   private String connectionType;
   private boolean powerOfComKey = false;

    public int getNumbersOfKeys() {
        return numbersOfKeys;
    }

    public void setNumbersOfKeys(int numbersOfKeys) {
        this.numbersOfKeys = numbersOfKeys;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isMechanical() {
        return mechanical;
    }

    public void setMechanical(boolean mechanical) {
        this.mechanical = mechanical;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
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

    void powerOn(){
        powerOfComKey = true;
    }
    void powerOff(){
        powerOfComKey = false;
    }

    void infoCK(){
        System.out.println("Number of Keys : " + numbersOfKeys);
        System.out.println("Color : " + color);
        System.out.println("Mechanical : " + mechanical);
        System.out.println("Size : " + size);
        System.out.println("Year of assembling :" + yearOfAssembling);
        System.out.println("Serial Number : " + serialNumber);
        System.out.println("Connection Type : " + connectionType);

    }
}
