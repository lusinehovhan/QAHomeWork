package com.company.Exercise8;

import java.util.Scanner;

public class Exercise3EnterNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean again = true;
        while (again) {
            again = false;
            System.out.print("Enter positive whole number from 1 to 9: ");
            int x = input.nextInt();
            if(x>=0 && x<=10) {
                String[] nums = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
                System.out.println(nums[x]);
            }else {
                again = true;
                System.out.println("The number isn't allowed.");
            }
        }
        }
    }

