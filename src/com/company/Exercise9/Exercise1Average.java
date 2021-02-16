package com.company.Exercise9;

public class Exercise1Average {
    public static void main(String[] args) {
int [] num = {4, 2, 6};
        System.out.println(average(num));
    }
    static int average (int [] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum +=arr[i];
        }
        return sum/arr.length;
    }
}
