package com.company.Exercise14;

public class Book {
    private String title;
    private int yearPub;
    private double price;

    public Book(String title, int yearPub, double price) {
        this.title = title;
        this.yearPub = yearPub;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearPub() {
        return yearPub;
    }

    public void setYearPub(int yearPub) {
        this.yearPub = yearPub;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void printBook() {
            System.out.println("Book Title: " + title + "\n"
                    + "Book Year Published: " + yearPub + "\n"
                    + "Book Price: " + price + "\n");
    }
}
