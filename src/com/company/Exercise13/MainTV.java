package com.company.Exercise13;

import javax.sound.midi.Soundbank;

public class MainTV {
    public static void main(String[] args) {
        TV tv1 = new TV("LG", "South Korea", 62.2, 110.7, 28, 4, 700 );
        TV tv2 = new TV("Panasonic", "Japan", 50.5, 100.8, 25, 5, 1500);
        TV tv3 = new TV("Metz", "Germany", 65, 120.2, 22, 3, 850);
        TV tv4 = new TV();
        TV tv5 = new TV("Samsung", 650);
        tv1.print();
        tv2.print();
        tv3.print();

        tv4.setBrand("Sony");
        tv4.setPrice(1200.99);
        System.out.println("TV brand is: " + tv4.getBrand() + "\n" + "TV price is: " + tv4.getPrice() + "$"+"\n");

        System.out.println("The brand fot TV #5 is: " +tv5.getBrand());
        tv5.setBrand("Sputnik");
        System.out.println("The brand fot TV #5 is: " +tv5.getBrand());



    }
}
