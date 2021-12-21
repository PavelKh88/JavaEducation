package com.rusin.Gerbert_Shild;

import javax.sound.midi.Soundbank;

public class ErrMsg {
    public static void main(String[] args) {
        ErrorMsg err = new ErrorMsg();
        System.out.println(err.getErrorMsg(2));
        System.out.println(err.getErrorMsg(19));
    }
}
