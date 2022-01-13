package com.rusin.Exercises_Part_1_22;

public class Sausage extends Product {

    Sausage(String name, double weight, ExpirationDate expirationDate){
        this.setName(name);
        this.setWeight(weight);
        this.setExpirationDate(expirationDate);
    }

    @Override
    public String toString() {
        return "Sausage{ " + " name = " + getName() + " weight = " + getWeight() + " " + getExpirationDate() + '}';
    }
}
