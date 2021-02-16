package com.company.Exercise9;

public class Exercise2String {
    public static void main(String[] args) {
        String [] str = {"BMW", "VOLVO", "TOYOTA", "JIGULI"};
        for(String ss: str){
            repeat(ss);
        }
    }
    static void repeat (String s){
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(0) == s.charAt(i)) {
                    System.out.println(s);
                }
            }
        }
    }
