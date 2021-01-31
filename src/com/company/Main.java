package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myNum = new Scanner(System.in);

        //#1
        boolean again = true;
        while (again) {
            again = false;
            System.out.print("Exercise #1. Enter two whole numbers and one Arithmetic Operator(/, *, -, +, %): ");
            int num1 = myNum.nextInt();
            int num2 = myNum.nextInt();
            char oper = myNum.next().charAt(0);
            switch (oper) {
                case '+':
                    System.out.println(num1 + " + " + num2 + " = " + (num1 + num2)+"\n");
                    System.out.println("End of Exercise #1. \n");
                    break;
                case '-':
                    System.out.println(num1 + " - " + num2 + " = " + (num1 - num2)+"\n");
                    System.out.println("End of Exercise #1. \n");
                    break;
                case '*':
                    System.out.println(num1 + " * " + num2 + " = " + (num1 * num2)+"\n");
                    System.out.println("End of Exercise #1. \n");
                    break;
                case '/':
                    System.out.println(num1 + " / " + num2 + " = " + Math.round((((num1 * 1.0) / num2)) * 100.0) / 100.0 + "\n");
                    System.out.println("End of Exercise #1. \n");
                    break;
                case '%':
                    System.out.println(num1 + " % " + num2 + " = " + (num1 % num2)+ "\n");
                    System.out.println("End of Exercise #1. \n");
                    break;
                default:
                    again = true;
                    System.out.println("Error. Please, enter two numbers and one of these Arithmetic Operators: /, *, -, +, %: \n");
            }
        }
            //#2
            System.out.println("Exercise #2. Enter 2 positive numbers: a number and its percent to be calculated:  ");
            System.out.println("(NOTE: if entered number is greater than 100, the fixed 105 percent will be calculated.)");
            double num3 = myNum.nextDouble();
            double per = myNum.nextDouble();
            double fixedPercent = 1.05;
            double result;
            if (num3 <= 100) {
                result = Math.round((num3 * (per / 100)) * 100.0) / 100.0;
                System.out.println("The " + per + "%" + " of number " + num3 + " will be " + result + "." + "\n");
            } else {
                result = Math.round((num3 * fixedPercent) * 100.0) / 100.0;
                System.out.println("Your input number is greater than 100 and fixed percent 105% is used for calculation.");
                System.out.println("The " + (int) (fixedPercent * 100) + "%" + " of number " + num3 + " will be " + result + "." + "\n");
            }
            System.out.println("End of Exercise #2. \n");


        //#3
        System.out.println("Exercise #3. Enter month name to find out the season it belongs to:");
String month = myNum.next();
switch (month){
    case "December":
    case "January":
    case "February":
        System.out.println(month + " is in the Winter. \n");
        break;
    case "March":
    case "April":
    case "May":
        System.out.println(month + " is in the Spring. \n");
        break;
    case "June":
    case "July":
    case "August":
        System.out.println(month + " is in the Summer. \n");
        break;
    case "September":
    case "October":
    case "November":
        System.out.println(month + " is in the Fall. \n");
        break;
        default:
            System.out.println("No match was found for month name. \n");
}
        System.out.println("End of Exercise #3.");

    }
}


