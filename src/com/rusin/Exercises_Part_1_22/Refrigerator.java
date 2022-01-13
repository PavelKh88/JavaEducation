package com.rusin.Exercises_Part_1_22;

import java.util.ArrayList;
import java.util.List;

public class Refrigerator {
    private List<Cheese> cheeses = new ArrayList<>();
    private List<Egg> eggs = new ArrayList<>();
    private List<Fish> fishList = new ArrayList<>();
    private List<Meat> meats = new ArrayList<>();
    private List<Sausage> sausages = new ArrayList<>();

    public void addProduct(Cheese cheese) {
        cheeses.add(cheese);
    }
    public void addProduct(Egg egg) {
        eggs.add(egg);
    }
    public void addProduct(Meat meat) {
        meats.add(meat);
    }
    public void addProduct(Sausage sausage) {
        sausages.add(sausage);
    }
    public void addProduct(Fish fish) {
        fishList.add(fish);
    }

    @Override
    public String toString() {
        return "Refrigerator{" +
                "cheeses=" + cheeses +
                ", eggs=" + eggs +
                ", fishList=" + fishList +
                ", meats=" + meats +
                ", sausages=" + sausages +
                '}';
    }
}
