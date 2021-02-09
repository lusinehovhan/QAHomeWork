package com.company.Exercise6;

public class Exercise3 {
    public static void main(String[] args) {
        int mat[][] = {{44, 28, 33, 22, 88, 99},
                {46, 22, 32, 41, 52, 69},
                {47, 58, 61, 84, 63, 74},
                {12, 19, 77, 52, 66, 94},
                {11, 20, 71, 63, 12, 47}
        };
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int p = 0;
        int r = 1;
        while(p < mat.length) {
            for (int i = p; i < mat.length; i++) {
                for (int j = p; j < mat[i].length - p; j++) {
                    if (i == p)
                        System.out.print(mat[i][j] + " ");
                    if (j == mat[i].length-r && i > p && i < mat.length-p)
                        System.out.print(mat[i][j] + " ");
                }
                for (int k = mat[i].length-1 - r; k > p; --k) {
                    if (i == mat.length - r) {
                        System.out.print(mat[i][k] + " ");
                    }
                }
            }
            for (int i = 0; i < mat.length; i++) {
                for (int k = mat.length - r; k > p; --k) {
                    if (i == p) {
                        System.out.print(mat[k][i] + " ");
                    }
                }
            }
            p++;
            r++;
        }
    }}


