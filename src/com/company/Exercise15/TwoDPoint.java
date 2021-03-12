package com.company.Exercise15;

public class TwoDPoint {
    private double x;
    private double y;

   public TwoDPoint(){

   }
    public TwoDPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }

    public void print(){
        System.out.println("x = " + x + "\n"+ "y = " + y);
    }
    public double distance(TwoDPoint a){
        double disX = a.x - this.x;
        double disY = a.y - this.y;
        return Math.sqrt(disX * disX + disY * disY);
    }
}
