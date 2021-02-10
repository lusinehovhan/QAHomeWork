package com.company.Exercise6;

public class Exersise5 {
    public static void main(String[] args) {
        int mat[][] = {{44, 28, 33, 22},
                {46, 22, 32, 41},
                {47, 58, 61, 84},
                {12, 19, 77, 52},
        };
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[j][i] + " ");
            }
            System.out.println();
        }
    }
}
