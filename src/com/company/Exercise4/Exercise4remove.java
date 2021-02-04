package com.company.Exercise4;

public class Exercise4remove {
    public static void main(String[] args) {
        int [] removeVar = {5, 8, 9, 7, 5, 9, 5, 9};
        int index = 4;
        for (int i = index; i < removeVar.length - 1; i++) {
            removeVar[i] = removeVar[i + 1];
        }
        for (int i = 0; i < removeVar.length; i++) {
            System.out.print(removeVar[i]+" ");
        }
    }
}
