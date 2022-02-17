package com.rusin.MyTests;

import java.util.*;

public class CardGenerator implements Runnable{
    private   Integer value = 0;
    private  List<Integer> valueSet = new ArrayList<>();

    public Integer getValue() {
        return value;
    }

    @Override
    public void run() {
            for (int i = 1; i <= 30; i++) {
                valueSet.add(i);
            }
        Collections.shuffle(valueSet);
        try {
            for (int i = 0; i < 30 ; i++) {
                value = valueSet.get(i);
                Thread.sleep(500);
                System.out.println(value);
            }
//                Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
