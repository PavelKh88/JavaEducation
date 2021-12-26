package com.rusin.Exercises_Part_1_9;

public class CoffeeMachine {
    private boolean powerCoffeeMachine = false;
    private double waterLevel = 1000;
    private double waterTemperature = 100;
    private  int coffeeStrength = 1;
    private double beverageVolume = 1;
    private int grindingDegree = 1;
    private boolean preWetting = false;
    private boolean preheatingCups = false;
    private double milkLevel = 500;

    public double getMilkLevel() {
        return milkLevel;
    }

    public void setMilkLevel(double milkLevel) {
        this.milkLevel = milkLevel;
    }

    public boolean isPowerCoffeeMachine() {
        return powerCoffeeMachine;
    }

    public void setPowerCoffeeMachine(boolean powerCoffeeMachine) {
        this.powerCoffeeMachine = powerCoffeeMachine;
    }

    public double getWaterLevel() {
        return waterLevel;
    }

    public void setWaterLevel(double waterLevel) {
        this.waterLevel = waterLevel;
    }

    public double getWaterTemperature() {
        return waterTemperature;
    }

    public void setWaterTemperature(double waterTemperature) {
        this.waterTemperature = waterTemperature;
    }

    public int getCoffeeStrength() {
        return coffeeStrength;
    }

    public void setCoffeeStrength(int coffeeStrength) {
        this.coffeeStrength = coffeeStrength;
    }

    public double getBeverageVolume() {
        return beverageVolume;
    }

    public void setBeverageVolume(double beverageVolume) {
        this.beverageVolume = beverageVolume;
    }

    public int getGrindingDegree() {
        return grindingDegree;
    }

    public void setGrindingDegree(int grindingDegree) {
        this.grindingDegree = grindingDegree;
    }

    public boolean isPreWetting() {
        return preWetting;
    }

    public void setPreWetting(boolean preWetting) {
        this.preWetting = preWetting;
    }

    public boolean isPreheatingCups() {
        return preheatingCups;
    }

    public void setPreheatingCups(boolean preheatingCups) {
        this.preheatingCups = preheatingCups;
    }

    public void statusCM(){
        System.out.println(" Power CoffeeMachine is : " + powerCoffeeMachine);
        System.out.println("Water level is : " + waterLevel);
        System.out.println("Water temperature is : " + waterTemperature);
        System.out.println("Coffee Strength is : " + coffeeStrength);
        System.out.println("Beverage Volume is : " + beverageVolume);
        System.out.println("Grinding Degree is : " + grindingDegree);
        System.out.println("Pre-Wetting is : " + preWetting);
        System.out.println("Pre-heating Cups is : " + preheatingCups);
        System.out.println("Milk volume is : " + milkLevel);
    }
    void onCM(){
        powerCoffeeMachine = true;
    }
    void ofCM(){
        powerCoffeeMachine = false;
    }



    void cappuccino(){
        if(powerCoffeeMachine == true){
            if(waterLevel >= 100){
                if(waterTemperature >= 70 && waterTemperature <= 100){
                    if(milkLevel >= 50){
                        waterLevel -= 100;
                        milkLevel -= 50;
                        coffeeStrength = 1;
                        grindingDegree = 1;
                        preWetting = true;
                        preheatingCups = true;
                    } else {
                        System.out.println("Milk volume is Low, Add Milk!!!");
                    }
                } else {
                    System.out.println("Water temperature is not normal!!!");
                }
            }
            else{
                System.out.println("Water volume is low , Please add water!!!");
            }
        }
        else{
            System.out.println("Power Coffee Machine is : OFF");
        }

    }

    void someCoffee(double waterLevel, double milkLevel,double waterTemperature){
        this.waterLevel -= waterLevel;
        this.milkLevel -= milkLevel;
        this.waterTemperature = waterTemperature;



    }




}
