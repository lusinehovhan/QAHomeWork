package com.company.Exercise7;

public class Exercise3TwoStrings {
    public static void main(String[] args) {
        String s1 = "abcdml";
        String s2 = "cdefkbcq";
        String k = "";
         int index = 0;
        for (int i = 0; i < s2.length(); i++) {
            for (int j = 0; j < s1.length(); j++) {
                if (s2.charAt(i) == s1.charAt(j)) {
                    index = i;
                }
            }
            if(i != index){
                k = k+s2.charAt(i);
            }
        }
        System.out.println("Elemnts of second String that are not in first String: " + k);
        System.out.println();
        String result = s1 + k;
        System.out.println("Concatenation of both Strings: " + result);
    }}


