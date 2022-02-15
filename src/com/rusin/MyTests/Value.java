package com.rusin.MyTests;

import java.util.*;

public class Value implements Runnable{
    public static Integer value = 0;
   List<Integer> valueSet = new ArrayList<>();
    @Override
    public void run() {
            for (int i = 1; i <= 30; i++) {
                valueSet.add(i);
            }
        Collections.shuffle(valueSet);
        try {
            for (int i = 0; i < 30 ; i++) {
                value = valueSet.get(i);
                Thread.sleep(1000);
                System.out.println(value);
            }
//                Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
