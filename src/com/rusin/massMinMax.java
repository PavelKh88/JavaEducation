package com.rusin;

public class massMinMax {
    public static void main(String args[]){

        int mass[] = new int[10];
        int max,min;

        mass[0]=99;
        mass[1]=-10;
        mass[2]=100123;
        mass[3]=18;
        mass[4]=-970;
        mass[5]=5623;
        mass[6]=463;
        mass[7]=-9;
        mass[8]=287;
        mass[9]=49;

        min=max=mass[0];
        for(int i=0;i<10;i++){          //если ставить вместо int i=0 int i=1  результат тот же. Почему не ноль?
            if(mass[i]<min) min=mass[i];
            if(mass[i]>max) max=mass[i];

        }
        System.out.println("min="+min+"  max= "+max);

    }
}
