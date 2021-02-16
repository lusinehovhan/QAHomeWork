package com.company.Exercise8;

public class Exercise4SumStrings {
    public static void main(String[] args) {
        int remainig = 0;
        String str1 = "99999";
        String str2 = "999";
        String strAdd = "";
        String sumStr = "";
        String result = "";
        int add_0 = str1.length() - str2.length();
        for (int i = 0; i < add_0; i++) {
            strAdd = strAdd + 0;
        }
        str2 = strAdd+str2;
        System.out.println("Number 1: " + str1);
        System.out.println("Number 2: " + str2);
        for (int i = str1.length()-1; i >= 0; i--) {
            int num1 = str1.charAt(i) - '0';
            int num2 = str2.charAt(i) - '0';
            int res = num1 + num2 + remainig;
            if (res > 9) {
                remainig = 1;
                res = res % 10;
            } else {
                remainig = 0;
            }
            sumStr = res + sumStr;
        }
        if(remainig>0) {
            result = 1 + sumStr;
        }
        System.out.println("The sum of Number 1 and Number 2 is: " + result);
    }
}
