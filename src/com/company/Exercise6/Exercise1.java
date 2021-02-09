package com.company.Exercise6;

public class Exercise1 {
    public static void main(String[] args) {
        int matrix[][] = {{44, 28, 33},
                          {46, 22, 32},
                          {47, 58, 61},
        };
        for (int i = 0; i < matrix.length ; i++) {
            System.out.println(matrix[i][i]);
        }
        System.out.println();
        for (int i = 0; i < matrix.length ; i++) {
            System.out.println(matrix[i][matrix.length-1-i]);
        }
    }
}
