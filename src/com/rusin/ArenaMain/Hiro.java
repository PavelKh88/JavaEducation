package com.rusin.ArenaMain;

public class Hiro {
     public int strength;
     public int health;

     public Hiro (int strength , int health ){
         this.health = health;
         this.strength = strength;
     }
     public int fight(int a){
          a = health - strength;
         return a;
     }

}
