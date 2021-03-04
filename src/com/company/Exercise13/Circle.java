package com.company.Exercise13;

public class Circle {
    private double radius = 7.7;
    private int x = 5;
    private int y = 3;

    public Circle (double r, int a, int b){
        radius = r;
        x = a;
        y = b;
    }
    public Circle (double r){
        radius = r;
    }
    public double area(){
        double areaCircle = 3.14 * radius * radius;
        return areaCircle;
    }
    public double perimeter(){
        double perimeterCircle = 2 * 3.14 * radius;
        return perimeterCircle;
    }

    public double getRadius() {
        return radius;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int a) {
        x = a;
    }

    public void setY(int b) {
        y = b;
    }

    public void print(){
        System.out.println("Radius = " + radius + "\n"
        + "Coordinate X = " + x + "\n"
        + "Coordinate Y = " + y);
    }
}
