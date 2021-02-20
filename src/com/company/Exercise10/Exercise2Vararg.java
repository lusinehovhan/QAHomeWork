package com.company.Exercise10;

public class Exercise2Vararg {
    public static void main(String[] args) {
        System.out.println("The sum is: " + funcVararg(5.5, 6.9, 7.1));
        System.out.println("The sum is: " + funcVararg(2.45, 4.8));
        System.out.println("The sum is: " + funcVararg(1, 1, 1, 1, 1, 20.5684));
        System.out.println("The sum is: " + funcVararg(8.5));

    }
    static int funcVararg(double... args) {
    double sum = 0;
        for (double s:args) {
            sum+=s;
        }
        return (int)sum;
    }
}
