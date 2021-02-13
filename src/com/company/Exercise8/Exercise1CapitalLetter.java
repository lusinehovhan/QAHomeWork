package com.company.Exercise8;

public class Exercise1CapitalLetter {
    public static void main(String[] args) {
        String s = "ape JAN Barev";
        String[] strArr = s.split(" ");
        String changeLetterSize = "";
        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            String changeLetter = "";
            for (int j = 0; j < strArr[i].length(); j++) {
                if (str.charAt(j) >= 'A' && str.charAt(j) <= 'Z') {
                    changeLetter = changeLetter + (char) (str.charAt(j) + ' ');
                }
                if (str.charAt(j) >= 'a' && str.charAt(j) <= 'z') {
                    changeLetter = changeLetter + (char) (str.charAt(j) - ' ');
                }
            }
            changeLetterSize = changeLetterSize + changeLetter + " ";
        }
        System.out.println(s);
        System.out.println(changeLetterSize);
    }}



