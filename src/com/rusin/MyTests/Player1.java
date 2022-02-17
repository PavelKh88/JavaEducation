package com.rusin.MyTests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Player1 extends Thread {
    private List<Integer> playerList = new ArrayList<>();
    private String name;
    private CardGenerator cardGenerator;

    public Player1(String name, CardGenerator cardGenerator) {
        this.name = name;
        this.cardGenerator = cardGenerator;
    }

    @Override
    public  void run() {
       List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 30 ; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
        for (int i = 0; i < 6 ; i++) {
            playerList.add(i,list.get(i));
        }
            System.out.println(playerList + " " + name);
        while (playerList.size() > 0) {
            playerList.remove(cardGenerator.getValue());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Player " + name + " Win");




    }
}
