package com.company.Exercise4;

public class Exercise3palindrome {
    public static void main(String[] args) {

        //#3
        int[] palindrome = {5, 8, 9, 7, 5};
        int count = 0;
        for (int i = 0; i < palindrome.length / 2; i++) {
            if (palindrome[i] == palindrome[palindrome.length - i - 1]) {
                count++;
            }
        }
        if (count == palindrome.length / 2) {
            System.out.println("The array is palindrome.");
        } else {
            System.out.println("The array is not palindrome");
        }
    }
}
