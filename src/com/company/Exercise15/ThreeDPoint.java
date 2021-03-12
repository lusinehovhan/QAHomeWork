package com.company.Exercise15;

public class ThreeDPoint extends TwoDPoint {
    private double z;

    public ThreeDPoint(double z) {
        this.z = z;
    }

    public ThreeDPoint(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }
    public ThreeDPoint(){

    }
    public double getZ() {
        return z;
    }
    public void setZ(double z) {
        this.z = z;
    }

    public void print3D(){
        print();
        System.out.println("z = "+ z);
    }
    public double distance(ThreeDPoint a){
        double disX = a.getX() - super.getX();
        double disY = a.getY() - super.getX();
        double disZ = a.z - this.z;
        return Math.sqrt(disX * disX + disY * disY + disZ *disZ);
    }
}
