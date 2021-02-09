package com.company.Exercise5;

public class Exercise6LongRepeat {
    public static void main(String[] args) {
        int [] array = {8, 8, 8, 9, 5, 2, 9, 9, 4, 8, 33, 33, 33, 33};
        int count = 1;
        int max = 1;
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] == array[i + 1]) {
                count++;
            } else {
                count = 1;
            }
            if(count>max){
                max = count;
            }
        }
        System.out.println(max);
    }
}
