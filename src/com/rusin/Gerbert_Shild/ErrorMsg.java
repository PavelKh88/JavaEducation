package com.rusin.Gerbert_Shild;

public class ErrorMsg {
    String msgs[] = {
            "Input Error",
            "Output Error",
            "Out of disk space",
            "Index out of range",
    };

    String getErrorMsg(int i){
        if(i >= 0 & i < msgs.length){
            return msgs[i];
        }
        else{
            return "Not-Existent error code ";
        }
    }
}
