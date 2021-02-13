package com.company.Exercise8;

public class Exercise1CapitalLetter {
    public static void main(String[] args) {
        String s = "ape JAN Barev";
        String letter = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                char t = (char) (ch + ' ');
                letter = letter + t;
            }else if (ch >= 'a' && ch <= 'z') {
                letter = letter + (char) (ch - ' ');
            }else {
                letter = letter + " ";
            }
        }
        System.out.println(s);
        System.out.print(letter);
    }}



