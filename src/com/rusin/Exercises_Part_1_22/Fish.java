package com.rusin.Exercises_Part_1_22;

public class Fish extends Product {
    Fish(String name, double weight, ExpirationDate expirationDate){
        this.setName(name);
        this.setWeight(weight);
        this.setExpirationDate(expirationDate);
    }

    @Override
    public String toString() {
        return "Fish{ " + " name = " + getName() + " weight = " + getWeight() + " " + getExpirationDate() + '}';
    }

}
