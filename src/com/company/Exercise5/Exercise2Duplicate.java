package com.company.Exercise5;

public class Exercise2Duplicate {
    public static void main(String[] args) {
        int[] array = {5, 6, 6, 8, 8, 8, 7, 8, 7, 9, 5, 5, 15, 8, 8, 22, 7};
        for (int i = 0; i < array.length; i++) {
            int count = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(array[i]+" "+"index= "+i);
            }
        }
    }
}
