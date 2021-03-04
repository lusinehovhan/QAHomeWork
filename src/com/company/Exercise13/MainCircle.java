package com.company.Exercise13;

public class MainCircle {
    public static void main(String[] args) {
        Circle cr1 = new Circle(5.5, 4, 8);
        Circle cr2 = new Circle(3.8);
        cr1.print();
        System.out.println();
        cr2.print();
        System.out.println();
        System.out.println(cr1.getRadius());
        System.out.println("X = " + cr1.getX() + ", " + "Y = " + cr1.getY());

        System.out.println("The area of Circl #1 is: " + cr1.area());
        System.out.println("The perimeter of Circle #2 is: " + cr2.perimeter());
        System.out.println();

        cr1.setX(6);
        cr1.print();
        System.out.println();

        cr2.setY(9);
        cr2.print();
    }
}
