package com.company.Exercise14;

public class Student {
    private static int count;
    private int stID;
    private String name;
    private String surName;
    private int yearStart;
    private double gpa;

    public Student(String name, String surName, int yearStart, double gpa) {
        this.name = name;
        this.surName = surName;
        this.yearStart = yearStart;
        this.gpa = gpa;
        count++;
        stID = count;
    }

    public int getStID() {
        return stID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getYearStart() {
        return yearStart;
    }

    public void setYearStart(int yearStart) {
        this.yearStart = yearStart;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void printStudent() {
            System.out.println("Student ID: " + stID + "\n"
                    + "Student Name: " + name + "\n"
                    + "Student Surname: " + surName + "\n"
                    + "Year of starting the program: " + yearStart + "\n"
                    + "Student GPA: " + gpa + "\n");
    }
}
