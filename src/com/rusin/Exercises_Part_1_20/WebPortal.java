package com.rusin.Exercises_Part_1_20;

import java.lang.reflect.Field;
import java.util.Objects;

public class WebPortal {
    private Resume  resume;

    public void abc (Resume resume1) {
        Class clazz = resume1.getClass();
        Field[] array = clazz.getDeclaredFields();
        for (Field f : array) {
           if(Objects.isNull(f)){
               System.out.println("Is null");
           }
           else{
               System.out.println("all good");
           }

        }
    }
}
