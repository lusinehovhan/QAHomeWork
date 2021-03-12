package com.company.Exercise15;

public class Cat extends Animal {
    protected String species;
    protected int averageLifespan;

    public Cat(){

    }

    public Cat(String species, int averageLifespan) {
        this.species = species;
        this.averageLifespan = averageLifespan;
    }

    public Cat(String type, String classAnimal, String species, int averageLifespan) {
        super(type, classAnimal);
        this.species = species;
        this.averageLifespan = averageLifespan;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAverageLifespan() {
        return averageLifespan;
    }

    public void setAverageLifespan(int averageLifespan) {
        this.averageLifespan = averageLifespan;
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
