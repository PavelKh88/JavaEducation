package com.rusin.Enum;

public class Enum1 {
    public static void main(String[] args) {
        Today today = new Today(DayOfWeek.MONDAY);
        today.daysInfo();
        System.out.println(today.dayOfWeek + today.dayOfWeek.getMood());
    }
}

enum DayOfWeek{
    MONDAY("bad day"),
    TUESDAY("s0-s0"),
    WEDNESDAY("NIse day"),
    THURSDAY("good day"),
    FRIDAY("perfect"),
    SATURDAY("good")
    ,SUNDAY("not good day");

    private String mood;

    DayOfWeek(String mood) {
        this.mood = mood;
    }

    public String getMood() {
        return mood;
    }
}

class Today{
    DayOfWeek dayOfWeek;

    public Today( DayOfWeek dayOfWeek) {
         this.dayOfWeek = dayOfWeek;
    }

    void daysInfo() {
        switch (dayOfWeek) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println(" Go To na Rabotu");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("mojno Otdohnut");
                break;
        }
    }
}
