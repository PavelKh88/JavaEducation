package com.rusin;

public class Mass2merniy {
    public static void main(String args[]){

        int t,i;
        int mass[][]=new int[3][4];
        for (t=0;t<3;t++) {
            for (i=0;i<4;i++){
                mass[t][i]=(t*4)+i+1;
                System.out.println(mass[t][i]+" ");
            }
            System.out.println();
        }




    }
}
