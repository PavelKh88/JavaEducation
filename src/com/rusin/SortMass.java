package com.rusin;

public class SortMass {

    public static void main(String args[]){

        int mass[]={99,-10,100123,18,-978,5623,463,-9,287,49};
        int a,b,t;
        int size=10;

        System.out.println("Исходный массив :");
        for(int i=0;i<size;i++)
            System.out.println(" "+mass[i]);
        System.out.println();

        for (a=1;a<size;a++)
            for (b=size-1;b>=a;b--){
                if(mass[b-1]>mass[b]){
                    t= mass[b-1];
                    mass[b-1]=mass[b];
                    mass[b]=t;


                }
            }
                        System.out.println("Отсортированый Массив:");
                    for (int i=0;i<size;i++)
                        System.out.println(" "+mass[i]);
                    System.out.println();
    }
}
