package com.company.Exercise6;

public class Exercise2 {
    public static void main(String[] args) {
        int matrix[][] = {{44, 28, 33},
                          {46, 22, 32},
                          {47, 58, 61},
        };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }
}
