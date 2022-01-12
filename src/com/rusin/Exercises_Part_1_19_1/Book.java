package com.rusin.Exercises_Part_1_19_1;

public class Book {
    private int width;
    private int pages;
    private String name;

    public Book(String name, int width, int pages) {
        this.name = name;
        this.pages = pages;
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "width=" + width +
                ", pages=" + pages +
                ", name='" + name + '\'' +
                '}';
    }
}

