package com.company.Exercise14;

public class Author {
    private Book[] book;
    private String name;
    private String surName;

    public Author(String name, String surName, Book[] book) {
        this.name = name;
        this.surName = surName;
        this.book = book;
    }

    public Book[] getBook() {
        return book;
    }

    public void setBook(Book[] book) {
        this.book = book;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public Book getBook(String name) {
        for (int i = 0; i < book.length; i++) {
            if (book[i].getTitle().equals(name)) {
                return book[i];
            }
        }
       return null;
    }
}

