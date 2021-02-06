package com.company.Exercise5;

public class Exercise3CountDuplicate {
    public static void main(String[] args) {
        int m = 1;
        int n = 100;
        int sum = 0;
        int[] array = {8, 7, 8, 7, 9, 15, 8, 8, 22};
        if (array[0] >= m && array[array.length-1] <= n) {
        for (int i = 0; i < array.length; i++) {
                int count = 0;
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        count++;
                        break;
                    }
                }
                sum = sum + count;
            }System.out.println("The total number of duplicated numbers is: " + sum + " ");
            }else {
            System.out.println("The array contains wrong value.");
        }
    }
}
