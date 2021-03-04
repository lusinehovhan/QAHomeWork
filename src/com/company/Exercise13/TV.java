package com.company.Exercise13;

public class TV {
    private String brand;
    private String countryMadeIn;
    private double height;
    private double width;
    private double depth;
    private double weighs;
    private double price;

    public TV(){}

    public TV(String b, String c, double h, double w, double d, double we, double p){
      brand = b;
      setCountryMadeIn(c);
      height = h;
      width = w;
      depth = d;
      setWeighs(we);
      setPrice(p);
    }
    public TV (String b, double p){
        brand = b;
        price = p;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String b) {
        brand = b;
    }

    public String getCountryMadeIn() {
        return countryMadeIn;
    }

    public void setCountryMadeIn(String c) {
        if(c.equals("South Korea") || c.equals("Japan")) {
            countryMadeIn = c;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double h) {
        height = h;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double w) {
        width = w;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double d) {
        depth = d;
    }

    public double getWeighs() {
        return weighs;
    }

    public void setWeighs(double we) {
        if(we < 5) {
            weighs = we;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double p) {
        if(p > 300 && p < 1800 ) {
            price = p;
        }
    }

    public void print(){
        System.out.println("TV brand: "+ brand+ "\n"
                +"TV country of origin: " + countryMadeIn +"\n"
                + "TV size: " + "\n" + "height " + height + "cm" + "\n"
                + "width " + width + "cm" + "\n" + "depth " + depth + "cm" + "\n"
                + "TV weighs " + weighs + "kg" + "\n" + "TV price: " + price + "$"+ "\n");
    }
    }

