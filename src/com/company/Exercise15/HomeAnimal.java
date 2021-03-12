package com.company.Exercise15;

import java.util.Arrays;

public class HomeAnimal extends Animal {
    private String [] species;
    private int averageLifespan;

    public HomeAnimal(){

    }

    public HomeAnimal(String[] species, int averageLifespan) {
        this.species = species;
        this.averageLifespan = averageLifespan;
    }

    public HomeAnimal(String type, String classAnimal, String[] species, int averageLifespan) {
        super(type, classAnimal);
        this.species = species;
        this.averageLifespan = averageLifespan;
    }

    public String[] getSpecies() {
        return species;
    }

    public void setSpecies(String[] species) {
        this.species = species;
    }

    public int getAverageLifespan() {
        return averageLifespan;
    }

    public void setAverageLifespan(int averageLifespan) {
        this.averageLifespan = averageLifespan;
    }

    public void printAnimal(){
        printAllAnimal();
        System.out.print("Species: ");
        for (int i = 0; i <species.length ; i++) {
            System.out.print(species[i]+", ");
        }
        System.out.println("\nAverage Lifespan " + averageLifespan + "\n");
    }

    public void printHomeAnimal(){
        System.out.print("Species: ");
        for (int i = 0; i <species.length ; i++) {
            System.out.print(species[i]+", ");
        }
        System.out.println("\nAverage Lifespan " + averageLifespan + "\n");
    }
}
