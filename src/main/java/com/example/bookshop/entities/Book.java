package com.example.bookshop.entities;

// не срабатывает анотация Lombok
public class Book {
    private long id;
    private String author;
    private String title;
    private int cost;

    public Book(String author, String title, int cost) {
        this.author = author;
        this.title = title;
        this.cost = cost;
    }

    public Book(long id, String author, String title, int cost) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.cost = cost;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
