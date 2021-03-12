package com.company.Exercise15;

public class AnimalMain {
    public static void main(String[] args) {
        Animal an1 = new Animal("Mammals", "Wolf");
        Animal an2 = new Animal("Bird", "Owl");
        Animal an3 = new Animal("Fish", "Goldfish");
        an2.printAllAnimal();
        System.out.println();

        HomeAnimal hom1 = new HomeAnimal("Mammals", "Cat", new String[]{"Sphynx", "Abyssinian", "Persian" }, 15);
        HomeAnimal hom2 = new HomeAnimal("Reptiles.", "Turtles", new String[]{"Red Eared", "Sideneck", "Musk"}, 35);
        HomeAnimal hom3 = new HomeAnimal(new String[]{"Wood Duck", "American Wigeon"}, 10);
        HomeAnimal hom4 = new HomeAnimal();

        hom1.printAnimal();
        hom2.printAnimal();
        hom3.printHomeAnimal();
    }
}
