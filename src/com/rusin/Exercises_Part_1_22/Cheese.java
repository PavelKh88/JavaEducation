package com.rusin.Exercises_Part_1_22;

public class Cheese extends Product{

    Cheese(String name, double weight, ExpirationDate expirationDate) {
        this.setName(name);
        this.setWeight(weight);
        this.setExpirationDate(expirationDate);


    }
    @Override
    public String toString() {
        return "Cheese{ " + " name = " + getName() + " weight = " + getWeight() + " " + getExpirationDate() + '}';
    }
}
