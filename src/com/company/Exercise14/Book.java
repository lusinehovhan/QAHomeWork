package com.company.Exercise14;

public class Book {
    private String title;
    private int yearPub;
    private double price;

    public Book(String title, int yearPub, double price) {
        setTitle(title);
        setYearPub(yearPub);
        setPrice(price);
    }

    public String getTitle() {
    return title;
    }
    public void setTitle(String title) {
    if(title.length() > 0) {
    this.title = title;
}
    }
    public int getYearPub() {
        return yearPub;
    }
    public void setYearPub(int yearPub) {
        if(yearPub > 1900 && yearPub < 2021) {
            this.yearPub = yearPub;
        }
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        if(price > 0) {
            this.price = price;
        }
    }
    public void printBook() {
            System.out.println("Book Title: " + title + "\n"
                    + "Book Year Published: " + yearPub + "\n"
                    + "Book Price: " + price + "\n");
    }
}
