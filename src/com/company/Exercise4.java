package com.company;

public class Exercise4 {
    public static void main(String[] args) {

        //#1 and #2
        int[] num = {3, 5, 10, -7, 11, 3, 0, -29, -4, 3, 3, -9};
        int countPositive = 0;
        int countNegative = 0;
        int countRepeat = -1;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > 0) {
                countPositive++;
            }
            if (num[i] < 0) {
                countNegative++;
            }
            if (num[0] == num[i]) {
                countRepeat++;
            }
        }
        System.out.println("Positive numbers count" + " " + countPositive);
        System.out.println("Negative numbers count" + " " + countNegative);
        System.out.println("The first number in aarray is repeated " + countRepeat + " times.");
    }
}
