package com.rusin.Exercises_Part_1_14;

public class SolarSystem {
    public static void main(String[] args) {
        Planet mercury = new Planet();
            mercury.setName("Mercury");
            mercury.setVolume("748 000 000 km²");
            mercury.setWeight("1,898E24 t");
            mercury.setDistanceFromTheStar("58 mil km");
        Planet venera = new Planet();
             venera.setName("Venera");
             venera.setWeight(" 460 200 000 km²");
             venera.setVolume("4,867E21 т");
             venera.setDistanceFromTheStar("108 mil km");
        Planet earth = new Planet();
             earth.setVolume("510 072 000 km²");
             earth.setWeight("5,972E21 т");
             earth.setName("Earth");
             earth.setDistanceFromTheStar("150 mil km");
        Planet mars = new Planet();
            mars.setName("Mars");
            mars.setWeight("6,39E20 т");
            mars.setVolume("144 800 000 км²");
            mars.setDistanceFromTheStar("227 mil km");
        Planet jupiter = new Planet();
            jupiter.setVolume("6,142E10 км²");
            jupiter.setWeight("1,898E24 т");
            jupiter.setName("Jupiter");
            jupiter.setDistanceFromTheStar("778 mil km");
        Planet saturn = new Planet();
            saturn.setName("Saturn");
            saturn.setWeight("5,683E23 т");
            saturn.setVolume("4,27E10");
            saturn.setDistanceFromTheStar("1,434E9 km");
        Planet uranus = new Planet();
            uranus.setName("Uranus");
            uranus.setVolume("8,083E9 km²");
            uranus.setWeight("8,681E22 т");
            uranus.setDistanceFromTheStar(" 2,871E9 км");
        Planet neptune = new Planet();
            neptune.setName("Neptune");
            neptune.setVolume("7,618E9 км²");
            neptune.setWeight("1,024E26 т");
            neptune.setDistanceFromTheStar("4,495E9 км");
        Star sun = new Star();
        sun.setName("The Sun");
        sun.setVolume("1.98892 х 10E30 кг");
        sun.setWeight("1,989E27 т");

    }


}
