package com.company.Exercise14;

public class FoodStoreMain {
    public static void main(String[] args) {
        FoodStore pr1 = new FoodStore("Fruit", "Apple", 30, 350);
        FoodStore pr2 = new FoodStore("Vegetable", "Carrot", 45, 250);
        FoodStore pr3 = new FoodStore("Nuts", "Walnut", 90, 1500);
        FoodStore pr4 = new FoodStore("Juice", "Orange", 45, 700);
        FoodStore pr5 = new FoodStore("Seeds", "Sunflower", 60, 600);

        FoodStore [] fd = {pr1, pr2, pr3, pr4, pr5};
        for (int i = 0; i < fd.length; i++) {
            System.out.println(fd[i].print());
            System.out.println();
        }


    }
}
