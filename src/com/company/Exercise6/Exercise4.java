package com.company.Exercise6;

public class Exercise4 {
    public static void main(String[] args) {
char matrix [][] = new char[5][5];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = '*';
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
