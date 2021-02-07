package com.company.Exercise5;

public class Exercise4ReverseArray {
    public static void main(String[] args) {
        int[] array = {8, 7, 8, 7, 9, 15, 8, 8, 22};
        int n = array.length;
        for (int i = 0; i < n/2; i++) {
            int temp = array[i];
            array[i] = array[n-1-i];
            array[n-1-i] = temp;
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();

        // Print array reverse
        for (int i = n-1; i >= 0; i--) {
            System.out.print(array[i]+" ");
        }
    }
}
