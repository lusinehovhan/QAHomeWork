package com.company.Exercise8;

public class Exercise4SumStrings {
    public static void main(String[] args) {
        String s1 = "451";
        String s2 = "300";
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
        int finalResult = number1 + number2;
        System.out.println("Number 2: " + number2);
        System.out.print("The sum of two String numbers will be: " +  finalResult);
        System.out.println();
        int temp;
        int count3= 0;
        temp = finalResult;
        while (finalResult>0){
            finalResult/=10;
            ++count3;
        }
        int [] array = new int[count3];
        for (int i = 0; i < array.length; i++) {
            array[i] = temp%10;
            temp = temp/10;
        }
        int[] arrayNumber = new int[array.length];
        int w = 0;
        for (int i = array.length-1; i >=0; i--) {
            arrayNumber[w] = array [i];
            w++;
        }
        System.out.println();
        String strResult = "";
        char [] digitCh = {'0','1','2','3','4','5','6','7','8','9'};
        for (int i = 0; i < arrayNumber.length; i++) {
            for (int j = 0; j < digitCh.length; j++) {
                int digit = digitCh[j] - '0';
                if(arrayNumber[i] == digit){
                    strResult = strResult + digitCh[j];
                }
            }
        }
        System.out.println(strResult);
    }
}
