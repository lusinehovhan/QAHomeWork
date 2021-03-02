package com.company.Exercise12;

class Flower{
String name;
String color;
String season = "Spring";
double height;
int numLeaves;
Flower(String n, String c, String s, double h, int l) {
    name = n;
    color = c;
    season = s;
    height = h;
    numLeaves = l;
}
     Flower(double h, int l){
        height = h;
        numLeaves = l;
    }
    Flower(String n, String c, String s){
    name = n;
    color = c;
    season = s;
    }
    Flower(String s){
    season = s;
    }
}
public class FlowerMain {
    public static void main(String[] args) {
      Flower fl1 = new Flower("Rose", "Yellow", "Summer", 35, 25);
      fl1.numLeaves = 30;
        System.out.println(fl1.numLeaves);
        Flower fl2 = new Flower(20, 10);
        Flower fl3 = new Flower("Lily", "White", "Fall");
        Flower fl4 = new Flower("Spring");
        fl4.season = "Winter";
        Flower fl5 = fl3;
        System.out.println(fl5.name);
        fl3 = null;
        System.out.println(fl5.name);
        fl2 = fl1;
        System.out.println(fl2.name);
        System.out.println((fl2.height));
        fl2 = fl3;
        System.out.println((fl2.height)); //NullPointerException
    }
}
