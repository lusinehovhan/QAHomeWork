package com.company;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner myNum = new Scanner(System.in);
        System.out.print("Enter 0 or 1: ");
        int x =myNum.nextInt();
        int z = (53*x) ^ 25;
        System.out.println(z);
    }
}

