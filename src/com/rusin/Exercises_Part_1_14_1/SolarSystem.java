package com.rusin.Exercises_Part_1_14_1;

import java.util.ArrayList;
import java.util.List;

public class SolarSystem {

    public static void main(String[] args) {
         //Почему не получаеться создать поля для класса СоларСистем? по тому что я вписал сюда Паблик статик Войд майн?


        ArrayList<Planet> planets = new ArrayList<Planet>();
        Planet mercury = new Planet("Mercury" , "748 000 000 km²", "1,898E24 t", "58 mil km");
        Planet veneer = new Planet("Veneer" , "460 200 000 km²", "4,867E21 т", "108 mil km");
        Planet earth = new Planet("Earth", "510 072 000 km²", "5,972E21 т", "150 mil km");
        Planet mars = new Planet("Mars", "144 800 000 км²","6,39E20 т", "227 mil km");
        Planet jupiter = new Planet("Jupiter", "6,142E10 км²", "1,898E24 т", "778 mil km");
        Planet saturn = new Planet("Saturn", "4,27E10 км²" ,"5,683E23 т", "1,434E9 km" );
        Planet uranus = new Planet("Uranus", "8,083E9 km²" , "8,681E22 т" , "2,871E9 км");
        Planet neptune = new Planet("Neptune", "7,618E9 км²", "1,024E26 т", "4,495E9 км");

        planets.add(mercury);
        planets.add(veneer);
        planets.add(earth);
        planets.add(mars);
        planets.add(jupiter);
        planets.add(saturn);
        planets.add(uranus);
        planets.add(neptune);

        Planet nebula = new Planet("nebula","100000","99999","888888");

        planets.add(nebula);
        System.out.println(planets.get(8));
        System.out.println(planets);
        planets.remove(nebula);
        System.out.println(planets);
    }
}
