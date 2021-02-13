package com.company.Exercise8;

public class Exercise2Number {
    public static void main(String[] args) {
        //Option 1
        int num1 = 5892;
        System.out.println(num1);
        while (num1 > 0){
            System.out.print(num1 % 10 +","+" ");
            num1 = num1 / 10;
        }
        System.out.println();

        //Option 2 Reverse
        int num = 5892;
        System.out.println(num);
        int temp;
        int count= 0;
        temp = num;
        while (num>0){
            num /=10;
            ++count;
        }
        int [] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            array[i] = temp%10;
            temp = temp/10;
        }
        for (int i = array.length-1; i >=0; i--) {
            System.out.print(array[i]+","+" ");
        }
        }
    }



