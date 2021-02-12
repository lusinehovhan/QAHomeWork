package com.company.Exercise7;

public class Exercise2Number {
    public static void main(String[] args) {
        char ch = '5';
        int result = 0;
        for (int i = 48; i < 58 ; i++) {
            result = ch-i;
            break;
        }
        System.out.println(result);
    }
}
