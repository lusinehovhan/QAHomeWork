package com.company.Exercise15;

public class Cat extends Animal {
    protected String name;
    protected String furColor;
    protected int age;

    public Cat(){

    }

    public Cat(String name, String furColor, int age) {
        this.name = name;
        this.furColor = furColor;
        this.age = age;
    }

    public Cat(String type, String classAnimal, String species, int averageLifespan, String name, String furColor, int age) {
        super(type, classAnimal, species, averageLifespan);
        this.name = name;
        this.furColor = furColor;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void printCatAnimal(){
        printAnimal();
        System.out.println("Name: " + name + "\n"
        + "Fur color: " + furColor + "\n"
        + "Age: " + age + "\n");
    }
    public void printCat(){
        System.out.println("Name: " + name + "\n"
                + "Fur color: " + furColor + "\n"
                + "Age: " + age + "\n");
    }
}
