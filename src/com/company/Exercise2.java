package com.company;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        Scanner myNum = new Scanner(System.in);

        //#1
        boolean again = true;
        while (again) {
            again = false;
            System.out.println("Exercise #1. Enter two whole numbers and one Arithmetic Operator(/, *, -, +, %): ");
            System.out.println("NOTE: In case of division, please, do not input 0 for number 2. ");
                int num1 = myNum.nextInt();
                int num2 = myNum.nextInt();
                char oper = myNum.next().charAt(0);
                switch (oper) {
                    case '+':
                        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2) + "\n");
                        System.out.println("End of Exercise #1. \n");
                        break;
                    case '-':
                        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2) + "\n");
                        System.out.println("End of Exercise #1. \n");
                        break;
                    case '*':
                        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2) + "\n");
                        System.out.println("End of Exercise #1. \n");
                        break;
                    case '/':
                        if (num2 > 0) {
                            System.out.println(num1 + " / " + num2 + " = " + Math.round((((num1 * 1.0) / num2)) * 100.0) / 100.0 + "\n");
                            System.out.println("End of Exercise #1. \n");
                            break;
                        }if (num2 == 0){
                        System.out.println("In case of division, please, do not input 0 for number 2.\n");
                        again = true;
                        break;
                        }
                    case '%':
                        System.out.println(num1 + " % " + num2 + " = " + (num1 % num2) + "\n");
                        System.out.println("End of Exercise #1. \n");
                        break;
                    default:
                        again = true;
                        System.out.println("Error. Please, enter two numbers and one of these Arithmetic Operators: /, *, -, +, %: \n");
                }
            }
            //#2
            System.out.println("Exercise #2. Enter 2 positive numbers: a number and its percent to be calculated:  ");
            System.out.println("(NOTE: if number representing percent is greater than 100, the fixed 105 percent will be used.)");
            double num3 = myNum.nextDouble();
            double per = myNum.nextDouble();
            double fixedPercent = 1.05;
            double result = (per <= 100)? Math.round((num3 * (per / 100)) * 100.0) / 100.0 : Math.round((num3 * fixedPercent) * 100.0) / 100.0;
        System.out.println("The result will be: " + result + "\n");
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


