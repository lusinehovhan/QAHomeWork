package com.company.Exercise15;

public class PointMain {
    public static void main(String[] args) {
        TwoDPoint two1 = new TwoDPoint(8, 6);
        two1.print();
        TwoDPoint two2 = new TwoDPoint();
        two2.setX(5);
        two2.setY(3);
        System.out.println("The distance between points two1(8, 6) and two2(5, 3) is: " + two1.distance(two2));
        System.out.println();

        ThreeDPoint three1 = new ThreeDPoint(6);
        three1.print3D();
        ThreeDPoint three2 = new ThreeDPoint(4, 2, 5);
        System.out.println("The distance between points three1(0, 0, 6) and three2(4, 2, 5) is: " + three1.distance(three2));
        System.out.println();

        ThreeDPoint three3 = new ThreeDPoint(6, 2, 1);
        three3.print3D();
        ThreeDPoint three4 = new ThreeDPoint(4, 2, 7);
        System.out.println("The distance between points three3(6, 2, 1) and three4(4, 2, 7) is: " + three3.distance(three4));

    }
}
