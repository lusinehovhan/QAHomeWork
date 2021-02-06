package com.company.Exercise5;

public class Exercise1PrimeNumber {
    public static void main(String[] args) {

        int[] array = {1, 8, 2, 7, 97, 9, 1, 17, 25, 37, 5, 14, 0, -15, 143, 67, 1261};
        for (int arrayPrime : array) {
            boolean prime = true;
            if (arrayPrime >= 2) {
                for(int j = 2; j <= arrayPrime/2; j++) {
                    if (arrayPrime % j == 0) {
                        prime = false;
                        break;
                    }
                }
                if (prime)  {
                    System.out.print(arrayPrime + " ");
                }
            }
        }
    }
}




