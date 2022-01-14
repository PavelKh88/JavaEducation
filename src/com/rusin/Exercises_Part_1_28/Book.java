package com.rusin.Exercises_Part_1_28;

public class Book {
    private String title;
    private int pages;
    private String author;
    private String category;
    private long isbn;

    public Book(String title, int pages, String author, String category, long isbn) {
        this.title = title;
        this.pages = pages;
        this.author = author;
        this.category = category;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public String getAuthor() {
        return author;
    }

    public String getCategory() {
        return category;
    }

    public long getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pages=" + pages +
                ", author='" + author + '\'' +
                ", category='" + category + '\'' +
                ", isbn=" + isbn +
                '}';
    }
}
