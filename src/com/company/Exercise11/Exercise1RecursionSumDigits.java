package com.company.Exercise11;

public class Exercise1RecursionSumDigits {
    public static void main(String[] args) {
        System.out.println(sumDigits(555));
    }
    static int sumDigits(int num) {
        if (num == 0)
            return 0;
        return (num % 10 + sumDigits(num / 10));
    }
}

