package com.rusin.Gerbert_Shild;

public class Overload {
    void ovlDemo (){
        System.out.println("no parameter");
    }
    void ovlDemo (int a){
        System.out.println("one parameter " + a );
    }
    int ovlDemo (int a, int b){
        System.out.println("two parameter " + a + " "+ b);
        return a + b ;
    }
    double ovlDemo (double a, double b){
        System.out.println("two parameter double " + a + " " + b);
        return a + b ;
    }
}
