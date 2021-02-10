package com.company.Exercise6;

public class Exercise2 {
    public static void main(String[] args) {
        int mat[][] = {{44, 28, 33, 22, 88, 99},
                       {46, 22, 32, 41, 52, 69},
                       {47, 58, 61, 84, 63, 74},
                       {12, 19, 77, 52, 66, 94},

        };
        int p = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
                p = mat[i].length;
            }
            System.out.println();
        }
        System.out.println();
            for (int j = 0; j < p; j++) {
                for (int i = 0; i < mat.length; i++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
