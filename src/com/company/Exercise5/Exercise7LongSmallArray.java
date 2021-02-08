package com.company.Exercise5;

public class Exercise7LongSmallArray {
    public static void main(String[] args) {
        int[] array = {8,7,9,5,5,4,6,7};
        int[] smarray = {9,5,5,4,3};
        int n = smarray.length;
        int index = 0;
        boolean t = true;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == smarray[index]) {
                index++;
            } else {
                index = 0;
            }
            if (index == n) {
                t = true;
                break;
            } else {
                t = false;
            }
        }
        System.out.println(t);
    }
}
