package com.company.Exercise15;

public class AnimalMain {
    public static void main(String[] args) {
        Animal an1 = new Animal("Mammals", "Wolf", "Devon Rex", 14);
        Animal an2 = new Animal("Bird", "Owl", "Barn", 25);
        Animal an3 = new Animal("Fish", "Goldfish", "Fantail", 15);
        an2.printAnimal();
        System.out.println();

        Cat cat1 = new Cat("Mammals", "Cat", "Devon Rex", 12, "Myau", "Grey", 5);
        Cat cat2 = new Cat("Mammals", "Cat", "Abyssinian", 16, "Fredy", "Copper", 3);
        Cat cat3 = new Cat("Mary", "White", 10);
        Cat cat4 = new Cat();

        cat1.printCatAnimal();
        cat3.printCat();
    }
}
