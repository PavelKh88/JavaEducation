package com.rusin.Exercises_Part_1_20;

import java.lang.reflect.Field;
import java.util.Objects;

public class WebPortal {

    private Resume  resume;

    public void addResume(Resume resume) {
        switch (resume.chekNull()){
            case 0 :
                System.err.println("all fields are not filled !!!");
            break;

            case 1 :
                this.resume = resume;
                System.out.println("resume Add!");
            break;

        }
    }

    @Override
    public String toString() {
        return "WebPortal{" +
                "resume=" + resume +
                '}';
    }
}
