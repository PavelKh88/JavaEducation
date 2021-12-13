package com.rusin.Gerbert_Shild;

public class Block {
    int a, b ,c;
    int volume;


    public Block(int i, int j, int k){
        a = i;
        b = j;
        c = k;
        volume = a * b *c;
    }
    boolean sameBlock(Block ob){
        if((ob.a == a) & (ob.b == b) & (ob.c == c)){
            return true;
        }
        else {
            return false;
        }
    }
    boolean sameValume(Block ob){
        if(ob.volume == volume){
            return true;
        }
        else {
            return false;
        }
    }

}
