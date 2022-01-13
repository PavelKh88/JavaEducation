package com.rusin.Exercises_Part_1_22;

public class Product {
    private String name;
    private double weight;
    private ExpirationDate expirationDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public ExpirationDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(ExpirationDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public static class ExpirationDate {
     private int day;
     private int month;
     private int year;

     ExpirationDate(int day, int month, int year) {
         this.day = day;
         this.year = year;
         this.month = month;
     }
        public int getDay() {
            return day;
        }

        public void setDay(int day) {
            this.day = day;
        }

        public int getMonth() {
            return month;
        }

        public void setMonth(int month) {
            this.month = month;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        @Override
        public String toString() {
            return "ExpirationDate{" +
                    "day=" + day +
                    ", month=" + month +
                    ", year=" + year +
                    '}';
        }
    }
}

