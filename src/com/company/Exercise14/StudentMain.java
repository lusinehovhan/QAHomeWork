package com.company.Exercise14;

public class StudentMain {
    public static void main(String[] args) {
        Student st1 = new Student("Alica", "Smith", 2020, 3.5);
        Student st2 = new Student("Lusine", "Whitfield", 2018, 3.6);
        Student st3 = new Student("Davit", "Brown", 2019, 3.8);
        Student st4 = new Student("Aghas", "White", 2017, 3.9);
        Student st5 = new Student("Milena", "Johnson", 2019, 3.3);
        Student st6 = new Student("Sergey", "Twain", 2018, 3.0);

        st1.printStudent();
        st2.printStudent();
        st3.printStudent();
        st4.printStudent();
        st5.printStudent();
        st6.printStudent();

        System.out.println("Student name: " + st2.getName() + " " + "id: " + st2.getStID());
        }
    }

