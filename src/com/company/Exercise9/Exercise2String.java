package com.company.Exercise9;

public class Exercise2String {
    public static void main(String[] args) {
        String [] str = {"BMW", "VOLVO", "TOYOTA", "JIGULI"};
        for(String ss: str){
            repeat(ss);
        }
    }
    static void repeat (String s){
        char ch = s.charAt(0);
        for (int j = 1; j < s.length(); j++) {
            if (ch == s.charAt(j)) {
                System.out.println(s);
                break;
            }
        }
    }
}
