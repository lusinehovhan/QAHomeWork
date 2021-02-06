package com.company.Exercise5;

public class Exercise1PrimeNumber {
    public static void main(String[] args) {
        int[] array = {1, 8, 2, 97, 9, 1, 17, 25, 37, 14, 0, -15};
        for (int i = 0; i < array.length; i++) {
            boolean prime = true;
            if (array[i] >= 2) {
                for (int j = 2; j < array[i]; j++) {
                    if (array[i] % j == 0) {
                        prime = false;
                        break;
                    }
                }
                if (prime) {
                    System.out.print(array[i] + " ");
                }
            }
        }
    }
}

