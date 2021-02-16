package com.company.Exercise9;

public class Exercise3Fibonacci {
    public static void main(String[] args) {
        fibonacci(20);
    }
    static void fibonacci(int count) {
        int n1 = 0;
        int n2 = 1;
        int n3;
        if (count < 0) {
            System.out.println("Negative number. Please, enter positive number.");
            return;
        }
        if (count == 0) {
            System.out.println("The entered value returns no result");
            return;
        }
        if (count == 1) {
            System.out.print(n1);
            return;
        }
        if (count == 2) {
            System.out.print(n1 + " " + n2 + " ");
            return;
        }
            System.out.print(n1 + " " + n2 + " ");
            for (int i = 2; i < count; i++) {
                n3 = n1 + n2;
                System.out.print(n3 + " ");
                n1 = n2;
                n2 = n3;
            }
        }
    }

