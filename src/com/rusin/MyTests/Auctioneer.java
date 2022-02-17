package com.rusin.MyTests;

import java.util.*;

public  class Auctioneer extends Thread{
    private Map<Integer,Integer> lots = new HashMap<>();
    protected static Boolean sold ;
    public static Integer price = 0;
    @Override
    public  void run() {

       Integer count = 1;
        for (int i = 500; i <= 5_000 ; i += 500 ) {
            lots.put(count,i);
            count++;
        }
        System.out.println(lots);
        Iterator<Integer> iteratorKey = lots.keySet().iterator();
        Iterator<Integer> iteratorValue = lots.values().iterator();
        while (iteratorKey.hasNext()) {
            sold = true;
          price = iteratorValue.next();
          System.out.println("Lot № " +  iteratorKey.next() + " Prise " + price);

          while (sold) {
              try {
               Thread.sleep(100);

              } catch (InterruptedException e) {
                  e.printStackTrace();
              }
          }

      }

    }
}

