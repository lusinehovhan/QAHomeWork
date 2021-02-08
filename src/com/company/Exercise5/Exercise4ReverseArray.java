package com.company.Exercise5;

public class Exercise4ReverseArray {
    public static void main(String[] args) {
        int[] array = {8, 7, 8, 7, 9, 15, 8, 8, 22};
     //   int n = array.length;
        for (int i = 0; i < array.length/2; i++) {
            int temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = temp;
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();

        // Print array reverse
        for (int i = array.length-1; i >= 0; i--) {
            System.out.print(array[i]+" ");
        }
    }
}
