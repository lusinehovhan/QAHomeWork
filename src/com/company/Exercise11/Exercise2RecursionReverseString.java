package com.company.Exercise11;

public class Exercise2RecursionReverseString {
    public static void main(String[] args) {
        reverS("Flower");
    }
    static void reverS(String s) {
        if ((s == null) || (s.length() <= 1))
            System.out.println(s);
        else {
            System.out.print(s.charAt(s.length() - 1));
            reverS(s.substring(0, s.length() - 1));
        }
    }
    }

