package com.company.Exercise7;

public class Exercise4Reverse {
    public static void main(String[] args) {
        String s = "Hello World Life";
        String[] strArr = s.split(" ");
        String reverse="";
        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            String reverse1 = "";
            for (int j = str.length()-1; j >= 0; j--){
                reverse1 = reverse1 + str.charAt(j);
            }
            reverse = reverse + reverse1 + " ";
        }
        System.out.println(s);
        System.out.println(reverse);
    }
    }

