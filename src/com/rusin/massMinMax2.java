package com.rusin;

public class massMinMax2 {
    public static void main(String args[]){

        int mass[]={1,2,3,44,55,666,777,888,999,-1000};
        int min,max;

        min=max=mass[0];
        for (int i=1;1<10;i++) {
            if (mass[i] < min) min = mass[i];
            if (mass[i] > max) max = mass[i];

            System.out.println("min"+min+"  max="+max);
        }
        //System.out.println("Выдает ошибку");

    }
}
