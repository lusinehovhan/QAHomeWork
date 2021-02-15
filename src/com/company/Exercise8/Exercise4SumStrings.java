package com.company.Exercise8;

public class Exercise4SumStrings {
    public static void main(String[] args) {
        String s1 = "500";
        String s2 = "1250";
        int count1 = 0;
        int count2 = 0;
        int result1 = 1;
        int result2 = 1;
        int number1 = 0;
        int number2 = 0;
        for (int i = s1.length()-1; i >=0; i--) {
            char ch = s1.charAt(i);
            int res1 = ch - '0';
            count1++;
            while ((count1-1) != 0) {
                result1 = result1 * 10;
                --count1;
            }
            number1 = number1 + res1 * result1;
        }
        System.out.println("Number 1: " + number1);
        for (int i = s2.length()-1; i >=0; i--) {
            char ch = s2.charAt(i);
            int res2 = ch - '0';
            count2++;
            while ((count2-1) != 0) {
                result2 = result2 * 10;
                --count2;
            }
            number2 = number2 + res2 * result2;
        }
        System.out.println("Number 2: " + number2);

        int finalResult = number1 + number2;

        System.out.println( "The sum of two String numbers will be: " +  finalResult);
    }
}
