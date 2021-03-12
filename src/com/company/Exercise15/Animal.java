package com.company.Exercise15;

public class Animal {
    private String type;
    private String classAnimal;

    public Animal(){

    }

    public Animal(String type, String classAnimal) {
        this.type = type;
        this.classAnimal = classAnimal;
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

    public void printAllAnimal(){
        System.out.println("Animal Type: " + type + "\n"
                + "Animal class: " + classAnimal);
    }
}
