package com.company.Exercise8;

import java.util.Scanner;

public class Exercise3EnterNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean again = true;
        while (again) {
            again = false;
        System.out.print("Enter positive whole number from 1 to 9: ");
            int x =input.nextInt();
            switch (x) {
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            if (x <= 0 || x > 9) {
                again = true;
                System.out.println("The number isn't allowed. Please, enter positive whole number from 1 to 9:");
            }
        }
        }
    }

