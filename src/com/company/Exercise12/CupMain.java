package com.company.Exercise12;

class Cup {
String text;
String color;
double radius;
double height = 7;
int packageCount;

Cup (){}

Cup (String t, String c){
    text = t;
    color = c;
}
Cup (String t, String c, double r, double h, int p){
    text = t;
    color = c;
    radius = r;
    height = h;
    packageCount = p;
}
Cup (int p){
    packageCount = p;
}
}
public class CupMain{
    public static void main(String[] args) {
        Cup cup = new Cup();
        cup.color = "Red";
        cup.text = "Life";
        System.out.println("The text on cup is: " + cup.text);

        Cup cup1 = new Cup("Sunshine", "Pink");
        cup1.color = "Green";
        System.out.println("The color of cup #1 is: " + cup1.color);
        System.out.println("The text on cup #1 is: " + cup1.text);

        Cup cup2 = new Cup("Kindness", "Yellow", 4, 5, 6);
        cup2.packageCount = 8;
        System.out.println("The nunmber of cups #2 in one package is: " + cup2.packageCount);

        Cup cup3 = new Cup(7);
        Cup cup4 = cup3;
        cup3.packageCount = 12;
        System.out.println("The nunmber of cups #3 in one package is: " + cup3.packageCount);
        System.out.println("Cup4 as reference of cup #3: " +  cup4.packageCount);
        cup3 = null;
        System.out.println(cup4.packageCount);
        cup3 = new Cup(5);
        System.out.println(cup3.packageCount);
        System.out.println(cup4.packageCount);
    }
}