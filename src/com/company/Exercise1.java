package com.company;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner myNum = new Scanner(System.in);
        //#4 The calculation of average when we do not know how many integers user will enter.
        System.out.print("Enter numbers and find their average: ");
        String input = myNum.nextLine();
        String[] numbersStr = input.split(" ");
        int[] numbers = new int[numbersStr.length];
        int sum1 = 0;
        for (int p = 0; p < numbersStr.length; p++ )
        {
            numbers[p] = Integer.parseInt( numbersStr[p] );
            sum1 += numbers[p];
        }
        double average1 = (double) sum1 / numbersStr.length;
        double ave1 = Math.round(average1*100.0)/100.0;
        System.out.println("The average of the enetered numbers is " + ave1);
        System.out.println();

        //#3
        System.out.print("Enter three numbers and find their average: ");
        int x = 3;
        int[] integers = new int[x];
        int sum = 0;
        for(int i = 0; i < x; i++)
        {
            integers[i] = myNum.nextInt();
            sum = sum + integers[i];
        }
        double average = (double)sum / x;
        double ave = Math.round(average*100.0)/100.0;
        System.out.println("The average of the enetered numbers is " + ave);
        System.out.println();

        //#1
        System.out.print("Enter two numbers and find their max value: ");
        double num1 = myNum.nextDouble();
        double num2 = myNum.nextDouble();
        double max;
        if(num1 > num2){
            max = num1;
        }
        else {
            max = num2;
        }
        System.out.println("The maximum of two entered numbers is: "+ max);
        System.out.println();

        //#2
        System.out.print("Enter number and check if it is even or odd: ");
        int num3 = myNum.nextInt();
        if (num3 % 2 == 0){
            System.out.println("The entered number is even.");
        }
        else {
            System.out.println("The entered number is odd.");
        }
        System.out.println();
        System.out.println("End of Exercise #1.");
    }
}

