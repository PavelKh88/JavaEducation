package com.rusin.Exercises_Part_1_14_1;

public class Planet  {
    private String name;
    private String volume;
    private String weight;
    private String distanceFromTheStar;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getDistanceFromTheStar() {
        return distanceFromTheStar;
    }

    public void setDistanceFromTheStar(String distanceFromTheStar) {
        this.distanceFromTheStar = distanceFromTheStar;
    }
    public Planet(String name, String volume, String weight, String distanceFromTheStar) {
        this.name = name;
        this.volume = volume;
        this.distanceFromTheStar = distanceFromTheStar;
        this.weight = weight;
    }

   @Override

    public String toString() {
        return
                "Planet : " + name + "\n" + "Volume : " + volume + "\n" + "Weight : " + weight + "\n" + "Distance From the Star : " + distanceFromTheStar + "\n" + "****************" + "\n";


    }
}
