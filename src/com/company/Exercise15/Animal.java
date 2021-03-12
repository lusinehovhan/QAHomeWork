package com.company.Exercise15;

public class Animal {
    protected String type;
    protected String classAnimal;
    protected String species;
    protected int averageLifespan;

    public Animal(){

    }

    public Animal(String type, String classAnimal, String species, int averageLifespan) {
        this.type = type;
        this.classAnimal = classAnimal;
        this.species = species;
        this.averageLifespan = averageLifespan;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getClassAnimal() {
        return classAnimal;
    }

    public void setClassAnimal(String classAnimal) {
        this.classAnimal = classAnimal;
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

    public void printAnimal(){
        System.out.println("Animal Type: " + type + "\n"
                + "Animal class: " + classAnimal + "\n"
                + "Species: " + species + "\n"
                + "Average Lifspan: " + averageLifespan);
    }

}
