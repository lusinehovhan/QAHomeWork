package com.company.Exercise5;

public class Exercise5CountMaxFrequency {
    public static void main(String[] args) {
        int[] array = {7, 8, 8, 8, 9, 5, 2, 9, 8, 9, 1, 2, 4, 4, 33, 33};
        int [] temp = new int [array.length];
        int max = temp[0];
        for (int i = 0; i < array.length; i++) {
            int count = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            temp[i] = count;
            if (max < temp[i]) {
                max = temp[i];
            }}
        System.out.println(max);
    }
}
